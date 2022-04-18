import java.util.Scanner;

public class MidAct1 {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int space = 1, row = 1, column = 1;
        System.out.print("Enter a number: ");
        int number = console.nextInt();
        int tempNumber = number;

        while(row <= number) {
            while(space < tempNumber) {
                System.out.print(" ");
                space++;
            }

            while(column <= row) {
                System.out.print(column + " ");
                column++;
            }

            System.out.println();
            space = 1;
            column = 1;
            tempNumber--;
            row++;

        }
    }
}
