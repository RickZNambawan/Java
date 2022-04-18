import java.util.Scanner;

public class MidAct3 {
    final static Scanner console = new Scanner(System.in);
    public static void main(String args[]) {
        int burger = 0, pancit = 0, lumpia = 0;
        int choice, quantity;
        boolean theAnswer;

        do {
            System.out.println("\nMenu for today:");
            System.out.println("[1] Burger\t P45");
            System.out.println("[2] Pancit\t P30");
            System.out.println("[3] Lumpia\t P5");
            System.out.print("What is your order?: ");
            choice = console.nextInt();
            System.out.print("How many orders(s)?: ");
            quantity = console.nextInt();
            if(choice == 1) {
                burger = burger + (45 * quantity);
            } else if(choice == 2) {
                pancit = pancit + (30 * quantity);
            } else if(choice == 3) {
                lumpia = lumpia + (5 * quantity);
            }

            theAnswer = customerAnswer();

        } while(theAnswer);
        System.out.println("\nTotal Bill: " + (burger + pancit + lumpia));
    }

    public static boolean customerAnswer() {
        boolean runAgain = true;
        char answer;

        System.out.print("Do you want to order again? [Y/N]: ");
        answer = console.next(".").charAt(0);
        if(answer == 'n' || answer == 'N') {
            runAgain = false;
        } else if(answer == 'y' || answer == 'Y') {
            runAgain = true;
        } else {
            System.out.println("\nInvalid input, please try again!");
            customerAnswer();
        }
        return runAgain;
    }
}
