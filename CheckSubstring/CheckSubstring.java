import java.util.*;

public class CheckSubstring {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter string s1:");
    String s1=scan.nextLine();
    System.out.println("Enter string s2:");
    String s2=scan.nextLine();

    if(s1.contains(s2))
      System.out.printf("%s is a substring of %s",s2,s1);
    else
      System.out.printf("%s is not a substring of %s",s2,s1);
  }
}
