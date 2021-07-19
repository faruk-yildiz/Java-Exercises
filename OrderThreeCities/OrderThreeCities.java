import java.util.*;

public class OrderThreeCities {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the first city:");
    String firstCity=scan.nextLine();
    System.out.println("Enter the second city:");
    String secondCity=scan.nextLine();
    System.out.println("Enter the third city:");
    String thirdCity=scan.nextLine();

    String temporary="";
    if(secondCity.compareTo(firstCity)<0 && secondCity.compareTo(thirdCity)<0)
      {
        temporary=firstCity;
        firstCity=secondCity;
        secondCity=temporary;
      }
    else if(thirdCity.compareTo(firstCity)<0 && thirdCity.compareTo(secondCity)<0)
    {
        temporary=firstCity;
        firstCity=thirdCity;
        thirdCity=temporary;
    }
    if(thirdCity.compareTo(secondCity)<0)
    {
      temporary=secondCity;
      secondCity=thirdCity;
      thirdCity=temporary;
    }
    System.out.printf("Alphabetical order %s %s %s ",firstCity,secondCity,thirdCity);
  }
}
