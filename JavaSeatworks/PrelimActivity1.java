import java.util.Scanner;

public class PrelimActivity1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value: ");
        final int feet = input.nextInt();
        final double feetToMeter = 0.3048 * feet;
        System.out.printf("%d ft = %f m", feet, feetToMeter);
    }
}
