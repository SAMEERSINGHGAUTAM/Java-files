import java.util.*;

public class UnaryOperator {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long b = sc.nextLong();

    float a = ++b; // pre-increment operator   
    
    System.out.println("Value of b: "+ b);
    System.out.println("Value of a: "+ a);

    a = --b; // pre-decrement operator
    System.out.println("Value of b: "+ b);
    System.out.println("Value of a: "+ a);

    a = b++; // post-increment operator
    System.out.println("Value of b: "+ b);
    System.out.println("Value of a: "+ a);

    a = b--; // post-decrement operator
    System.out.println("Value of b: "+ b);
    System.out.println("Value of a: "+ a);
     // Note - In case of two different operands to the either side of assignment operator. 
  }
}