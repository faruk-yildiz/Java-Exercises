import java.util.Arrays;

public class CountSingleDigits {
  public static void main(String[] args) {
    int [] counts =new int[10];
    countDigits(counts);
    for (int i=0;i<counts.length;i++)
    {
      System.out.print(i+"s "+counts[i] +" \n");

    }
  }
  public static void countDigits(int [] counts)
  {

    for(int i=0;i<100;i++)
    {
        int random=(int)(Math.random()*10);
        counts[random]++;
    }
  }
}
