import java.util.*;

public class AnalyzeScores {
  public static void main(String[] args) {
    int[] scores=new int[100];
    System.out.println("Enter the scores");
    double average=readScoresCalculateAverage(scores);
    int aboveOrEqual=0;
    int below=0;
    for (int i=0;i<100;i++)
    {
      if(scores[i]>0)
      {
        if(scores[i]>=average)
         aboveOrEqual++;
        else
          below++;

      }
    }
    System.out.println(" Average is "+average +"\n Number of scores above or equal to average "+
    aboveOrEqual+ "\n Number of scores below average "+below);
  }
  public static double readScoresCalculateAverage(int [] scores)
  {
    Scanner scan=new Scanner(System.in);
    int i;
    int input;
    double sum=0.0;
    double average=0.0;
    for (i=0;i<100;i++)
    {
      input=scan.nextInt();
      if(input<0)
        break;
      scores[i]=input;
      sum+=input;
    }
    average=sum/i;
    return average;
  }
}
