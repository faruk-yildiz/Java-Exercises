import java.util.*;

public class CheckSSN {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter SSN:");
    String ssn=scan.nextLine();
    boolean isValid=ssn.length()==11 &&
    Character.isDigit(ssn.charAt(0)) &&
    Character.isDigit(ssn.charAt(1)) &&
    Character.isDigit(ssn.charAt(2)) &&
    ssn.charAt(3)=='-' &&
    Character.isDigit(ssn.charAt(4)) &&
    Character.isDigit(ssn.charAt(5)) &&
    ssn.charAt(6)=='-' &&
    Character.isDigit(ssn.charAt(7)) &&
    Character.isDigit(ssn.charAt(8)) &&
    Character.isDigit(ssn.charAt(9)) &&
    Character.isDigit(ssn.charAt(10));

    if(isValid)
      System.out.printf("%s is a valid ss number",ssn);
    else
      System.out.printf("%s is a invalid ss number",ssn);
  }
}
