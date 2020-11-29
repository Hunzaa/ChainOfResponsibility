public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Cash cash);
}