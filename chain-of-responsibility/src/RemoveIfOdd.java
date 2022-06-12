import java.io.*;
import java.util.Arrays;

public class RemoveIfOdd implements ChainOfResponsibility{

    private ChainOfResponsibility nextArray;

    @Override
    public void setNextChain(ChainOfResponsibility nextChain) {
        this.nextArray = nextChain;
    }

    @Override
    public void remove(String inputFile, String outputFile) {
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(inputFile));
             PrintWriter printWriter = new PrintWriter(new FileWriter(outputFile))) {
            int size = dataInputStream.readInt();
            double[] array = new double[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = dataInputStream.readDouble();
            }
            if (array[0] % 2 != 0) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] % 2 == 0){
                        printWriter.println(array[i]);
                    }
                }
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                }
            } else nextArray.remove(inputFile, outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
