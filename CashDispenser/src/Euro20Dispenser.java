public class Euro20Dispenser implements DispenseChain {

    private DispenseChain nextInChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void dispense(Cash cash) {
        if (cash.getAmount() >= 20) {
            int number = cash.getAmount() / 20;
            int remainder = cash.getAmount() % 20;
            System.out.println("- Dispensing " + number + " 20€ note(s)");
            if (remainder != 0)
                nextInChain.dispense(new Cash(remainder));
        } else {
            nextInChain.dispense(cash);
        }
    }
}