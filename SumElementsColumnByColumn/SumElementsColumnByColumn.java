import java.util.*;

public class SumElementsColumnByColumn {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    double [][] m=new double[3][4];
    System.out.println("Enter a 3 by 4 matrix row by row :");
    for (int i=0;i<m.length;i++)
    {
        for (int j=0;j<m[i].length;j++)
        {
            m[i][j]=scan.nextDouble();
        }
    }
    for (int c=0;c<4;c++)
    {
        System.out.println("Sum of the elements at column "+c+" is "+sumColumn(m,c));
    }
  }
  public static double sumColumn(double [][] m,int columnIndex)
  {
      double sum=0.0;
      for (int i=0;i<m.length;i++)
          sum+=m[i][columnIndex];
      return sum;
  }
}
