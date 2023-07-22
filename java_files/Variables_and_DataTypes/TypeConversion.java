import java.util.*;

public class TypeConversion {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a small integer");
    float a = sc.nextByte();
    System.out.println(a);
    System.out.println("Enter a integer greater than before");
    a= sc.nextShort();
    System.out.println(a);
 
    a = sc.nextLong();// error
    System.out.println(a);
    System.out.println("Enter a floating point number");
    double b = sc.nextFloat();
    System.out.println(b);
   

    
  }
}