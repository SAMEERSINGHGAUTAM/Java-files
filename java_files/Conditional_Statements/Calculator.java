import java.util.*;

public class Calculator {

  public static float Calculator(float a , float b , char c) {
     float calc = 0;
     switch(c) {
       case 'a' :
            calc = a + b ;
              break ;
       case 'b' :
            calc = a - b ;
              break ;
        case 'c' :
            calc = a * b ;
              break ;
        case 'd' :
            calc = a / b ;
              break ;
        case 'e' :
            calc = a % b ;
              break ;
        default :
           System.out.println("Wrong Operator:");
     }
     return calc;
  }
  public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number:");
       float a = sc.nextFloat();
       System.out.println("Enter another number:");
       float b = sc.nextFloat();
       System.out.println("Select an operator:-\na : + \nb : - \nc : *\nd : /\ne : %");
       char c =sc.next().trim().charAt(0);
       
       System.out.println(Calculator(a,b,c));
       
  }
}