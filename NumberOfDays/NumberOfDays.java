import java.util.*;

public class NumberOfDays{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the year");
    int year=scan.nextInt();
    System.out.println("Enter the month as integer");
    int month=scan.nextInt();

    switch (month) {
      case 1:
        System.out.printf("January of %d has 31 days",year);
      break;
      case 2:
        if((year%4==0 || year%400==0) && year%100!=0)
        System.out.printf("February of %d has 29 days",year);
        else
        System.out.printf("February of %d has 28 days",year);
      break;
      case 3:
        System.out.printf("March of %d has 31 days",year);
      break;
      case 4:
        System.out.printf("April of %d has 30 days",year);
      break;
      case 5:
        System.out.printf("May of %d has 31 days",year);
      break;
      case 6:
        System.out.printf("June of %d has 30 days",year);
      break;
      case 7:
        System.out.printf("July of %d has 31 days",year);
      break;
      case 8:
        System.out.printf("August of %d has 31 days",year);
      break;
      case 9:
        System.out.printf("September of %d has 30 days",year);
      break;
      case 10:
        System.out.printf("October of %d has 31 days",year);
      break;
      case 11:
        System.out.printf("November of %d has 30 days",year);
      break;
      case 12:
        System.out.printf("December of %d has 31 days",year);
      break;
    }

  }
}
