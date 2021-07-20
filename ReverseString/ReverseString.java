import java.util.*;

public class ReverseString {
  public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter a string");
      String s1=scan.nextLine();
      String s2="";
      for(int i=0;i<s1.length();i++)
      {
        s2=s2+s1.charAt(s1.length()-(i+1));
      }
      System.out.println("Reverse is "+s2);
  }
}
