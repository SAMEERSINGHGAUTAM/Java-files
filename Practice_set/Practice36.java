// Conditional Statements (switch statements)
import java.util.*;
public class Practice36 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a character:");
    char value = sc.next().trim().charAt(0);

    switch(value) {
      case 'a' : System.out.println("a");
                    break;
      case 'b' : System.out.println("b");
                    break;
      case 'c' : System.out.println("c");
                    break;
      case '4' : System.out.println('4');
                    break;
      case '&' : System.out.println("Enter a number:");
                 int num = sc.nextInt();
                 int Num = (int)Math.pow(num,0.5f);
                 if(num<=1) {
                  System.out.println("not prime");
                 }
                  for (int i = 2 ; i <= num; i++) {
                    if((i < Num) && (num != 2) && (num%i == 0)) {
                      System.out.println("not prime");
                    } else {
                      System.out.println("prime");
                      break;
                    }
                  }
                  
                    break;
      case 'A' : System.out.println('A');
                    break;
      default  : System.out.println("no such character");
        
    }

  }
}
