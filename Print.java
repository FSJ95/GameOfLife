import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Print {
  String menu = "+----------------------------------+\n" +
                "|         THE GAME OF LIFE         |\n" +
                "+----------------------------------+\n" +
                "|  These are your options:         |\n" +
                "|                                  |\n" +
                "|  1. START the simulation.        |\n" +
                "|  2. STOP the simulation.         |\n" +
                "|  3. Change the simulation size.  |\n" +
                "|  4. Change initial alive cells.  |\n" +
                "+----------------------------------+";
  public void printMenu(){
    clearScreen();
    System.out.println(menu);
  }
  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
