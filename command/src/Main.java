import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private Command command;

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputFileName = bufferedReader.readLine();
        String outputFileName = bufferedReader.readLine();

        System.out.println("ZeroCarryStart");
        main.setPrintCommand(new ZeroCarryStart());
        main.printArray(inputFileName, outputFileName);

        System.out.println("ZeroCarryEnd");
        main.setPrintCommand(new ZeroCarryEnd());
        main.printArray(inputFileName, outputFileName);
    }

    public void setPrintCommand(Command command){
        this.command = command;
    }

    public void printArray(String inputFileName, String outputFileName){
        command.zeroCarry(inputFileName, outputFileName);
    }
}
