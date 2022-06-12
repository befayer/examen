import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("outputForChain.txt"));
        dataOutputStream.writeInt(10);
        dataOutputStream.writeDouble(6);
        dataOutputStream.writeDouble(373);
        dataOutputStream.writeDouble(347);
        dataOutputStream.writeDouble(5);
        dataOutputStream.writeDouble(0);
        dataOutputStream.writeDouble(43);
        dataOutputStream.writeDouble(34);
        dataOutputStream.writeDouble(7);
        dataOutputStream.writeDouble(2);
        dataOutputStream.writeDouble(5);

        ChainOfResponsibility startHandler = new RemoveIfEven();
        startHandler.setNextChain(new RemoveIfOdd());
        startHandler.remove("outputForChain.txt", "output.txt");
    }
}
