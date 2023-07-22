import java.util.*;

public class LargestOf3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Number:");
    float a = sc.nextFloat();
    System.out.println("Enter the second number:");
    float b = sc.nextFloat();
    System.out.println("Enter your third number:");
    float c = sc.nextFloat();
    float greater;

    // if(a>b) {
      // if(a>c) {
        // greater = a;
      // } else {
        // greater = c;
      // } 
    // } else {
      // if(b>c) {
        // greater = a ;
      // } else {
        // greater = c;
      // }
    // }

    if(a>=b && a>=c) {
      greater = a;
    } else if(b>=c) {
      greater = b;
    } else {
      greater = c;
    }
    System.out.println("Greater: " +greater);
  }
}