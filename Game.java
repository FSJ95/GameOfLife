import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Game {
  public static void main(String[] args) {
    List<ArrayList<String>> board = new ArrayList<ArrayList<String>>();

    Settings settings = new Settings();
    Print printer = new Print();

    boolean quitGame = false;
    int choice = 0;
    int boardSize = 10;


    while (!quitGame) {
      Scanner scanner = new Scanner(System.in);
      board = createBoard(boardSize);
      printer.printMenu(board, 0);
      if (scanner.hasNextInt()) {
          choice = (scanner.nextInt());
          if (choice == 1){

          } else if (choice == 2) {

          } else if (choice == 3) {
            printer.printMenu(board, choice);
            while(choice==3) {
              Scanner scanner3 = new Scanner(System.in);
              if (scanner3.hasNextInt()) {
                  int newChoice = (scanner3.nextInt());
                  if (newChoice == 0){
                    choice = 0;
                    continue;
                  } else {
                    boardSize = newChoice;
                    choice = 0;
                  }

              } else {

              }
            }

          } else if (choice == 4) {

          } else if (choice == 5) {
            System.out.println("Thanks for playing!");
            quitGame = true;
          } else {
            System.out.println("Didn't type a valid option..");
            continue;
          }
      } else {
        System.out.println("Didn't type a int..");
      }


    }
  }

  public static List<ArrayList<String>> createBoard(int size){
    List<ArrayList<String>> createBoard = new ArrayList<ArrayList<String>>();
    ArrayList<String> createRow = new ArrayList<String>();
    for (int y = 0; y < size; y++) {
      createRow.clear();
      for (int x = 0; x < size; x++) {
        if ((x % 2) == 0) {
          createRow.add("1");
        } else {
          createRow.add("0");
        }
      }
      createBoard.add(createRow);
    }
    return createBoard;
  }
}
