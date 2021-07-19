import java.util.*;

public class ProcessString {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter a string");
    String s1=scan.nextLine();
    System.out.printf("Length of the string is %d and first character is %c",s1.length(),s1.charAt(0));
  }
}
