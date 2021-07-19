import java.util.*;

public class HeadsOrTails{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int random=(int)(Math.random()*2);
    String coin="";
    if(random==0)
      coin="heads";
    else
      coin="tails";
    System.out.println("What is your guess (heads or tails)");
    String answer=scan.nextLine();
    if(answer.equalsIgnoreCase(coin))
      System.out.println("Your guess is correct!");
    else
      System.out.println("Your guess is incorrect!");
  }
}
