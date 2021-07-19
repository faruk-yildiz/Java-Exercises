import java.util.*;

public class CharacterOfASCIICode {
  public static void main(String[] args) {
      System.out.println("Enter a character:");
      Scanner scan=new Scanner(System.in);
      String char_string=scan.nextLine();
      char character=char_string.charAt(0);
      int unicode=character;
      System.out.printf("The unicode for the character %c is \\u00%x",character,unicode);
  }
}
