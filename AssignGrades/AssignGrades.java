import java.util.*;

public class AssignGrades {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number of students");
    int nOfStu=scan.nextInt();
    int [] scores=new int[nOfStu];
    char [] grades=new char[nOfStu];
    int best=0;
    System.out.printf("Enter %d scores \n",scores.length);
    for (int i=0;i<scores.length;i++) {
      scores[i]=scan.nextInt();
      if(scores[i]>best)
        best=scores[i];
    }
    for (int j=0;j<scores.length;j++) {
      if(scores[j]>=best-10)
        grades[j]='A';
      else if(scores[j]>=best-20)
        grades[j]='B';
      else if(scores[j]>=best-30)
        grades[j]='C';
      else if(scores[j]>=best-40)
        grades[j]='D';
      else
        grades[j]='F';
    }
    for (int k=0;k<scores.length;k++) {
      System.out.printf("Student %d score is %d and grade is %c \n",(k+1),scores[k],grades[k]);
    }
  }
}
