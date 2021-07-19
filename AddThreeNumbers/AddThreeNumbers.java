import java.util.*;

public class AddThreeNumbers{
  public static void main(String[] args) {
    int num1=(int)(Math.random()*10);
    int num2=(int)(Math.random()*10);
    int num3=(int)(Math.random()*10);

    System.out.printf("What is the answer %d+%d+%d:",num1,num2,num3);
    Scanner scan=new Scanner(System.in);
    int answer=scan.nextInt();

    System.out.printf("Your answer is %b",(num1+num2+num3==answer));

  }
}
