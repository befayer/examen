import java.io.*;

public class ZeroCarryEnd implements Command{
    @Override
    public void zeroCarry(String inputFile, String outputFile) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream(outputFile))) {
            int size = Integer.parseInt(bufferedReader.readLine());
            double temp;
            double[] array = new double[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = Double.parseDouble(bufferedReader.readLine());
            }
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = array.length - 1; j > i; j--) {
                    //array[j-1] == 0 - нули в конец
                    //array[j] == 0 - нули в начало
                    if (array[j-1] == 0) {
                        temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
            ois.writeObject(array);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
