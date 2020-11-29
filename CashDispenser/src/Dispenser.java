import java.util.Scanner;

public class Dispenser {
    public static void main(String[] args) {

        DispenseChain c1 = new Euro50Dispenser();
        DispenseChain c2 = new Euro20Dispenser();
        DispenseChain c3 = new Euro10Dispenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);

        int amount;
        System.out.println("Enter amount to dispense: ");
        Scanner input = new Scanner(System.in);
        amount = input.nextInt();

        int remainder = amount % 10;
        if ((amount > 10) && (remainder != 0)) {
            System.out.println("Error! Amount should be in multiple of 10s.");
        } else {
            c1.dispense(new Cash(amount));
            System.out.println("Total amount dispensed = €" + amount);
        }
    }
}