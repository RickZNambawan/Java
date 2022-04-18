import java.util.*;

class SpaceRemover {
    final static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.print("Enter a famous line you know: ");
        String mostFamousLine = input.nextLine();
        char letter[] = mostFamousLine.toCharArray();

        for (int counter = 0; counter < letter.length; counter++) {
            char currentCharacter = letter[counter];
            if (currentCharacter == ' ') {
                System.out.print("-");
            } else {
                System.out.print(currentCharacter);
            }
        }

        System.out.println();
    }
}
