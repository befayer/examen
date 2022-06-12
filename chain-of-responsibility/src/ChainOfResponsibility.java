public interface ChainOfResponsibility {
    void setNextChain(ChainOfResponsibility nextChain);
    void remove(String inputFile, String outputFile);
}
