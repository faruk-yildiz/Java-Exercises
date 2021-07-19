import java.util.*;

public class NumberOfYears{
  public static void main(String[] args) {
    System.out.println("Enter the number of minutes");
    Scanner scan=new Scanner(System.in);
    long minutes=scan.nextLong();
    long hours=minutes/60;
    minutes=minutes%60;
    long days=hours/24;
    hours=hours%24;
    long years=days/365;
    days=days%365;
    System.out.printf("%d minutes is %d years , %d days , %d hours and %d minutes ",minTemp,years,days,hours,minutes);
  }
}
