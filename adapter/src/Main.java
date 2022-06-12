import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        AdapterOutputStream adapterOutputStream = new AdapterOutputStream();
        String[] array = new String[]{"firstString", "secondString", "thirdString"};
        OutputStream outputStream = System.out;
        adapterOutputStream.adapterOutputStream(array, outputStream);
    }
}
