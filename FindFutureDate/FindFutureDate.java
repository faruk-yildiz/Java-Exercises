import java.util.*;

public class FindFutureDate{
  public static void main(String[] args) {
    System.out.println("Enter today's day:");
    Scanner scan=new Scanner(System.in);
    int todayDay=scan.nextInt();
    String today="";
    System.out.println("Enter the number days elapsed since today:");
    int future=scan.nextInt();

    switch (todayDay) {
      case 0:
        today="Sunday";
        break;
      case 1:
        today="Monday";
        break;
      case 2:
        today="Tuesday";
        break;
      case 3:
        today="Wednesday";
        break;
      case 4:
        today="Thursday";
        break;
      case 5:
        today="Friday";
        break;
      case 6:
        today="Saturday";
        break;
    }

    switch((todayDay+future)%7)
    {
    case 0:
     System.out.println("Today is "+today+" and the future day is Sunday");
     break;
    case 1:
      System.out.println("Today is "+today+" and the future day is Monday");
      break;
    case 2:
      System.out.println("Today is "+today+" and the future day is Tuesday");
      break;
    case 3:
      System.out.println("Today is "+today+" and the future day is Wednesday");
      break;
    case 4:
      System.out.println("Today is "+today+" and the future day is Thursday");
      break;
    case 5:
      System.out.println("Today is "+today+" and the future day is Friday");
      break;
    case 6:
      System.out.println("Today is "+today+" and the future day is Saturday");
      break;
  }
}
}
