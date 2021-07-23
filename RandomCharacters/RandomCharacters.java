
public class RandomCharacters {
  public static void main(String[] args) {
    randomCharacters();
  }
  public static void randomCharacters()
  {
    int count=0;
    for(int i=0;i<100;i++)
    {
      char random=(char)(65+(int)(Math.random()*26));
      if(count%50==0)
      {
        System.out.printf("\n%2c",random);
        count++;
      }
      else
      {
        System.out.printf("%2c",random);
        count++;
      }
    }
    count=0;
    for(int i=0;i<100;i++)
      {
        int randomDigit=(int)(Math.random()*10);
        if(count%50==0)
        {
          System.out.printf("\n%2d",randomDigit);
          count++;
        }
        else
        {
          System.out.printf("%2d",randomDigit);
          count++;
        }
    }
  }
}
