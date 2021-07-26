import java.util.*;

public class OccurrenceOfNumbers {
  public static void main(String[] args) {

    int[] counts=new int[100];
    System.out.println("Enter the integers between 1 and 100");
    count(counts);
    for (int i=0;i<counts.length;i++) {
      if(counts[i]>0)
        System.out.println((i+1)+"occurs"+counts[i]+"time"+(counts[i]>1? "s" :"" ));

    }
  }
  public static void count(int [] count)
  {
    Scanner scan=new Scanner(System.in);
    int input;
    do {
      input=scan.nextInt();
      if(input>=1&&input<=100)
        count[input-1]++;


    } while (input!=0);
  }
}
