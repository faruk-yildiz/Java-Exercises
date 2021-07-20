import java.util.*;

public class FindTheHighestScore {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    String name="";
    String highestname="";
    int highestScore=0;
    int score=0;
    System.out.println("Enter the number of students:");
    int nOfStudens=scan.nextInt();
    if(nOfStudens>=1)
    {
      for (int i=0;i<nOfStudens;i++){
        System.out.println("Enter student's name");
        name=scan.next();
        System.out.println("Enter student's score");
        score=scan.nextInt();
        if(score>highestScore){
          highestScore=score;
          highestname=name;
        }
      }
      System.out.printf("Highest score is %d and student's name %s",highestScore,highestname);
    }
    else
      System.out.println("Invalid input");
  }
}
