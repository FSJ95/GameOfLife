import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Printer {
  List<ArrayList<String>> printBoard = new ArrayList<ArrayList<String>>();
  ArrayList<String> printRow = new ArrayList<String>();

  String isAlive = "[■]";
  String isDead = "[ ]";

  // Clearer consollen.
  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }


  // Omskriver værdier i board som dead(0) eller alive(1) i printBoard.
  public void rewriteBoard(List<ArrayList<String>> brd) {
    for(List list : brd){
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

  public void printBoard(List<ArrayList<String>> brd) {
    this.rewriteBoard(brd);
    for(List list : printBoard){
      int printCounter = 0;
      for(Object value : list){
            System.out.print(value);
            if ( printCounter == printBoard.lastIndexOf(list)) {
              System.out.println("");
            }
            printCounter++;
      }
    }
  }

  // Printer hver eneste værdi i hele listen af lister.
  public void printAllValues() {
    for(List list : printBoard){
      for(Object value : list){
          System.out.println(value);
      }
    }
  }

  // Printer hver eneste liste i listen af lister.
  public void printAllLists() {
    for(List list : printBoard){
      System.out.println(list);
    }
  }
}
