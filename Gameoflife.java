import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Gameoflife {
  public static void main(String[] args) {
    Printer printer = new Printer();
    String input = "";
    int boardSize = 0;
    boolean validInput1 = false;
    boolean validInput2 = false;

    // Input
    Scanner scanner = new Scanner(System.in);


    while (!validInput1) {
      printer.clearScreen();
      System.out.println("Velkommen til The Game Of Life!");
      System.out.println("Hvor stort ønsker du at spillet skal være? (int)");
      System.out.print("> ");
      input = scanner.nextLine();
      if(input.matches("\\d+"))
      {
        boardSize = Integer.parseInt(input);

        while (!validInput2) {
          printer.clearScreen();
          System.out.println("Du har valgt størrelsen " + boardSize + "x" + boardSize + ".");
          System.out.println("Hvilke felter ønsker du er levende? (Eksempel: 1,2 2,3 5,5 6,6)");
          System.out.print("> ");
          input = scanner.nextLine();
          String[] aliveFields = input.split(" ");
          setAliveFields(aliveFields, boardSize);
          validInput2=true;
        }
        validInput1=true;
      }
    }
  }

  public static void setAliveFields(String[] arr, int size){
    boolean matches = false;
    List<ArrayList<String>> board = new ArrayList<ArrayList<String>>();
    for (int y = 0; y < size; y++) {
      ArrayList<String> row = new ArrayList<String>();
      for (int x = 0; x < size; x++) {
        for (Object field : arr){
          matches = false;
          if(field.toString().matches("\\d+,\\d+")){
            System.out.println("x " + x);
            System.out.println("y " + y);
            System.out.println("my x " + Integer.parseInt(field.toString().substring(0,",".length())));
            System.out.println("my y " + Integer.parseInt(field.toString().substring(",".length()+1)));
            System.out.println("matches " + (x == Integer.parseInt(field.toString().substring(0,",".length()))
                  && y == Integer.parseInt(field.toString().substring(",".length()+1))));
            if (x == Integer.parseInt(field.toString().substring(0,",".length()))
                  && y == Integer.parseInt(field.toString().substring(",".length()+1))) {
              matches = true;
            } else {
              matches = false;
            }
          }
        }
        if (matches==true) {
          row.add("1");
        } else {
          row.add("0");
        }
      }
      board.add(row);
      System.out.println(row);
      System.out.println(board);
    }
    Printer printer = new Printer();
    printer.printBoard(board);
  }
}
