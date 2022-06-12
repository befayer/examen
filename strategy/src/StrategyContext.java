public class StrategyContext {

    private Strategy strategy = new ZeroCarryStart();

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(String inputFileName, String outputFileName){
        strategy.zeroCarry(inputFileName, outputFileName);
    }
}
