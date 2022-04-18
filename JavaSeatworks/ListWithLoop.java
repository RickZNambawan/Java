import java.util.*;

public class ListWithLoop {
    private final static Scanner sc = new Scanner(System.in);
    private final static ArrayList <Integer> myList = new ArrayList<>();

    public static void main(String[] args) {
        addToList();
        deleteFromList();
    }

    public static void addToList() {
        System.out.println("Enter anything:");
        int counter = 0;
        int userInp = 0;
        while (counter < 10) {
          userInp = sc.nextInt();
          myList.add(userInp);
          counter++;
        }
    }

    public static void deleteFromList() {
      while(!myList.isEmpty()) {
        System.out.print("\nEnter what number you want to delete: ");
        int deleteNumber = sc.nextInt();
        for(int index = 0; index < myList.size(); index++) {
          if(myList.get(index) == deleteNumber) {
            myList.remove(index);
            index = -1;
          }
        }
        showList();
        System.out.println("Size: " + myList.size());
      }
      System.out.println("The List is now Empty!");
    }

    public static void showList() {
        System.out.println("-------------------------");
        for (int counter: myList) {
            System.out.print(counter + " ");
        }
        System.out.println();
    }
}
