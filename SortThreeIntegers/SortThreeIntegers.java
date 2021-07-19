import java.util.*;

public class SortThreeIntegers{
  public static void main(String[] args) {
    System.out.println("Enter three integers:");
    Scanner scan=new Scanner(System.in);
    int number1=scan.nextInt();
    int number2=scan.nextInt();
    int number3=scan.nextInt();

    int highest=number1>number2 && number1>number3 ? number1 :number2>number1&&number2>number3? number2:number3;
    int lowest=number1<number2 &&number1<number3 ? number1 : number2<number1&&number2<number3?number2:number3;
    int middle=number1!=highest && number1!=lowest ? number1 : number2!=highest&&number2!=lowest?number2:number3;

    System.out.printf("%d<%d<%d",lowest,middle,highest);

  }
}
