public class LargestN {
  public static void main(String[] args) {
    int n=1;
    int largestN=1;
    while (n*n*n<12000) {
      largestN=n;
      n++;
    }
    System.out.println("Largest n such that n^3<12000 is "+largestN);
  }
}
