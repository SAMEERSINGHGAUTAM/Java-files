import java.util.*;

public class Switch1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character:");

    char ch = sc.next().trim().charAt(0);

    switch(ch) {

      case 'c' : 
          System.out.println("Samosa");
              break;
      case 'a' :
          System.out.println("Burger");
              break;
      case 'h' :
          System.out.println("Mango Shek");
              break;
      default :
          System.out.println("we are dreaming");
    }
  }
}