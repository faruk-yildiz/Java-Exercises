import java.util.*;

public class CheckISBN{
  public static void main(String[] args) {
    System.out.println("Enter the first 9 digits of an ISBN with spaces:");
    Scanner scan=new Scanner(System.in);
    int d1=scan.nextInt();
    int d2=scan.nextInt();
    int d3=scan.nextInt();
    int d4=scan.nextInt();
    int d5=scan.nextInt();
    int d6=scan.nextInt();
    int d7=scan.nextInt();
    int d8=scan.nextInt();
    int d9=scan.nextInt();
    int d10=(d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
    if(d10==10)
      System.out.printf("The ISBN-10 number is %d%d%d%d%d%d%d%d%dX",d1,d2,d3,d4,d5,d6,d7,d8,d9);
    else
      System.out.printf("The ISBN-10 number is %d%d%d%d%d%d%d%d%d%d",d1,d2,d3,d4,d5,d6,d7,d8,d9,d10);
  }
}
