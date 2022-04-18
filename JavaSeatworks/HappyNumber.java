import java.util.Scanner;

public class HappyNumber {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter a number: ");
        int userInp = sc.nextInt();

        while(true) {
            if(userInp == 1) {
                System.out.println("HAPPY");
                System.out.print("Total:" + userInp);
                break;
            }
            else {
                userInp = totalNumber(userInp);
            }
        }
    }

    public static int totalNumber(int total) {
        String itemToString, tempTotal = Integer.toString(total);
        Integer anotherNumber, itemToInt;
        total = 0;

        for(int counter = 0; counter < tempTotal.length(); counter++) {
            char item = tempTotal.charAt(counter);
            itemToString = Character.toString(item);
            itemToInt = new Integer(itemToString);
            anotherNumber = itemToInt * itemToInt;
            total = total + anotherNumber;
        }

        return total;
    }
}
