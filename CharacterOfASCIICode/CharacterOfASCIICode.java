import java.util.*;

public class CharacterOfASCIICode {
  public static void main(String[] args) {
      System.out.println("Enter an ASCII code (0-127):");
      Scanner scan=new Scanner(System.in);
      int charAscii=scan.nextInt();
      char character=(char)charAscii;
      System.out.println("The character for ASCII code "+charAscii+" is "+character);
  }
}
