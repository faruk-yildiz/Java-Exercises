
public class ASCIICharacterTable {
  public static void main(String[] args) {
    int counter=1;
    for (int i='!';i<='~';i++) {
      if(counter%10==0){
        System.out.println((char)i);
        counter++;
      }
      else{
        System.out.print((char)i+" ");
        counter++;
      }
    }
  }
}
