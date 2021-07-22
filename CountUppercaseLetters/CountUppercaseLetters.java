import java.util.*;

public class CountUppercaseLetters {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter a string");
    String s1=scan.nextLine();
    int uppercase=0;
    for (int i=0;i<s1.length();i++) {
      if(Character.isUpperCase(s1.charAt(i)))
        uppercase++;
    }
    System.out.println("The number of uppercase letters is "+uppercase);
  }
}
