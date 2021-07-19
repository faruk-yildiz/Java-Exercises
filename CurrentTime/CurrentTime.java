import java.util.*;

public class CurrentTime{
  public static void main(String[] args) {
    System.out.println("Enter the time zone offset to (-11--+12) GMT:");
    Scanner scan=new Scanner(System.in);
    int timeZone=scan.nextInt();
    long milliSecondsInHour=1000*60*60;
    long milliSeconds=System.currentTimeMillis()+(timeZone*milliSecondsInHour);
    long totalSeconds=milliSeconds/1000;
    long currentSeconds=totalSeconds%60;
    long totalMinutes=totalSeconds/60;
    long currentMinutes=totalMinutes%60;
    long totalHour=totalMinutes/60;
    long currentHours=totalHour%24;
    System.out.printf("Current time in GMT%d is %d:%d:%d",timeZone,currentHours,currentMinutes,currentSeconds);
  }
}
