import java.util.*;

public class MajorDiagonal {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter nXn matrix dimensions");
    int n=scan.nextInt();
    double [][] matrix=new double[n][n];
    getMatrix(matrix, n);
    System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(matrix));
  }
  public static void getMatrix(double [][] m,int n)
  {
    Scanner scan=new Scanner(System.in);
    System.out.printf("Enter %dx%d matrix row by row \n",n,n);
    for (int i=0;i<n;i++)
    {
        for (int j=0;j<n;j++)
        {
            m[i][j]=scan.nextDouble();
        }
    }
  }
  public static double sumMajorDiagonal(double [][] m)
  {
    double sum=0.0;
    for (int i=0;i<m.length;i++)
    {
      sum+=m[i][i];
    }
    return sum;
  }
}
