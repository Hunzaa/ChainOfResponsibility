public class Euro50Dispenser implements DispenseChain {

    private DispenseChain nextInChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void dispense(Cash cash) {
        if (cash.getAmount() >= 50) {
            int number = cash.getAmount() / 50;
            int remainder = cash.getAmount() % 50;
            System.out.println("- Dispensing " + number + " 50€ note(s)");
            if (remainder != 0)
                nextInChain.dispense(new Cash(remainder));
        } else {
            nextInChain.dispense(cash);
        }
    }
}