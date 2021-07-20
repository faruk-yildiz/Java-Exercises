import java.util.*;

public class PositiveAndNegativeNumbers {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int sum=0;
    int num=0;
    int count=0;
    int nOfPos=0;
    int nOfNeg=0;
    double average=0.0;
    System.out.println("Enter an integer the input ends if it is 0:");
    num=scan.nextInt();
    if(num==0)
      System.out.println("No numbers are entered except zero");
    else{
        while (num!=0){
          if(num<0)
            nOfNeg++;
          else if(num>0)
            nOfPos++;
          sum+=num;
          num=scan.nextInt();
          count++;
        }
    average=sum/(double)count;
    System.out.printf("The number of positives is %d \n The number of negatives is %d \n The total is %d \n The average is %.2f",nOfPos,nOfNeg,sum,average);
      }
  }
}
