import java.util.Scanner;

public class PrelimActivty2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a distance value: ");
        final int distanceValue = input.nextInt();
        final int loops = distanceValue / 250;
        System.out.printf("Total Loops in: %d\n", loops);

        final int stone = (loops * 250) + 50;
        final int asphalt = (loops * 250) + 50 + 70;
        final int mud = (loops * 250) + 50 + 70 + 40;
        final int sand = (loops * 250) + 50 + 70 + 40 + 90;

        if(distanceValue <= stone) {
            System.out.println("The current location is: Stone");
        } else if (distanceValue <= asphalt) {
            System.out.println("The current location is: Asphalt");
        } else if (distanceValue <= mud) {
            System.out.println("The current location is: Mud");
        } else if (distanceValue <= sand) {
            System.out.println("The current location is: Sand");
        }
    }
}
