import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("ZeroCarryStart");
        StrategyContext strategyContext = new StrategyContext();
        strategyContext.executeStrategy("input.txt", "output.txt");

        System.out.println("ZeroCarryEnd");
        strategyContext.setStrategy(new ZeroCarryEnd());
        strategyContext.executeStrategy("input.txt", "output.txt");
    }
}
