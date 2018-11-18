import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Print {
  List<ArrayList<String>> printBoard = new ArrayList<ArrayList<String>>();
  ArrayList<String> printRow = new ArrayList<String>();

  String isAlive = "[■]";
  String isDead = "[ ]";
  String spacer = "|  ";
  String line = "+----------------------------------+";
  String menu = "+----------------------------------+\n" +
                "|         THE GAME OF LIFE         |\n" +
                "+----------------------------------+\n" +
                "|  These are your options:         |\n" +
                "|                                  |\n" +
                "|  1. START the simulation.        |\n" +
                "|  2. STOP the simulation.         |\n" +
                "|  3. Change the simulation size.  |\n" +
                "|  4. Change initial alive cells.  |\n" +
                "|  5. Quit the program.            |\n" +
                "+----------------------------------+";
  String option3 = "+----------------------------------+\n" +
                    "|         THE GAME OF LIFE         |\n" +
                    "+----------------------------------+\n" +
                    "|  Change the simulation size.     |\n" +
                    "|                                  |\n" +
                    "|  Please type in the wanted sim-  |\n" +
                    "|  ulation size as a single int.   |\n" +
                    "|  ( Recommended size is 10 )      |\n" +
                    "|                                  |\n" +
                    "|  Type '0' to go back.            |\n" +
                    "+----------------------------------+";

  public void printMenu(List<ArrayList<String>> bordToPrint, int option){
    if (option == 0){
      clearScreen();
      System.out.println(menu);
      printBoard(bordToPrint);
      System.out.println(spacer);
      System.out.println(line);
      System.out.println(spacer);
      System.out.print("|  > ");
    } else if (option == 2) {

    } else if (option == 3) {
      clearScreen();
      System.out.println(option3);
      printBoard(bordToPrint);
      System.out.println(spacer);
      System.out.println(line);
      System.out.println(spacer);
      System.out.print("|  > ");
    } else if (option == 4) {

    } else if (option == 5) {

    } else {

    }
  }
  public void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public void rewriteBoard(List<ArrayList<String>> bordToRewrite) {
    printBoard.clear();
    for(List list : bordToRewrite){
      printRow.clear();
      for(Object value : list){
        if (value.equals("0")) {
          printRow.add(isDead);
        } else {
          printRow.add(isAlive);
        }
      }
      printBoard.add(printRow);
    }
  }

  public void printBoard(List<ArrayList<String>> bordToPrint) {
    this.rewriteBoard(bordToPrint);
    System.out.println(spacer);
    for(List list : printBoard){
      int printCounter = 0;
      System.out.print(spacer);
      for(Object value : list){
            System.out.print(value);
            if ( printCounter == printBoard.lastIndexOf(list)) {
              System.out.println("");
            }
            printCounter++;
      }
    }
  }
}
