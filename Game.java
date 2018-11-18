import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Game {
  public static void main(String[] args) {
    Print printer = new Print();

    boolean quitGame = false;
    int choice = 0;

    while (!quitGame) {
      Scanner scanner = new Scanner(System.in);
      printer.printMenu();
      System.out.print("|  > ");
      if (scanner.hasNextInt()) {
          choice = (scanner.nextInt());
          if (choice == 1){

          } else if (choice == 2) {

          } else if (choice == 3) {

          } else if (choice == 4) {

          } else {
            System.out.println("Didn't type a valid option..");
            continue;
          }
      } else {
        System.out.println("Didn't type a int..");
      }


    }
  }
}
