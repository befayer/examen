import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000);
             Socket clientSocket = serverSocket.accept();
             ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
             DataOutputStream dos = new DataOutputStream(clientSocket.getOutputStream())){
            double[] array = (double[]) ois.readObject();
            dos.writeInt( Proxy.calculator(array));
            dos.flush();
        }
        catch (IOException | ClassNotFoundException e ){
            System.out.println("Error");
        }
    }
}
