import java.util.*;


public class TypePromotion6 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // short a = 123;
    System.out.println("Enter a small integer:");
    short a =sc.nextShort();
    a += (short)(5);
    a *= (short)5;
    System.out.println(a);
  }
}