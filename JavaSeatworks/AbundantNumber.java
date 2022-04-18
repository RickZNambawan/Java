import java.util.Scanner;

public class AbundantNumber {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int input = console.nextInt();
        int sumOfFactors = 0;
        int abundantNumber = 0;
        int inputSquared = input * 2;

        if (input == 0) {
            System.out.print("Zero or Negative is not allowed.");
        } else {
            for (int counter = 1; counter <= input; counter++) {
                if ((input % counter) == 0) {
                    sumOfFactors += counter;
                }
            }

            if (sumOfFactors > inputSquared) {
                abundantNumber = sumOfFactors - inputSquared;
                System.out.printf("%d is an Abundant Number.\n", input);
                System.out.printf("The abundance is: %d\n", abundantNumber);
            } else {
                System.out.printf("%d is not an Abundant Number.\n", input);
            }
        }
    }
}
