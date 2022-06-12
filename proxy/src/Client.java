import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Не задан размер массива");
        }
        else {
            try (Socket socket = new Socket("localhost", 5000);
                 ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                 DataInputStream dis = new DataInputStream(socket.getInputStream())) {
                Random random = new Random();
                double[] array = new double[]{1, 2, 3,4,5,6,7,8,9,1};
                /*for (int i = 0; i < array.length; i++) {
                    array[i] = random.nextDouble();
                    System.out.println(array[i]);
                }*/
                oos.writeObject(array);
                oos.flush();
                int result = dis.readInt();
                System.out.println(result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
