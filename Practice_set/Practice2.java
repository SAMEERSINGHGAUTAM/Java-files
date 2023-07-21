// Unary operators

public class Practice2 {
  public static void main(String args[]) {
    int x = 25, y = 20;
    System.out.println("Value of x: "+x);
    System.out.println("Value of y: "+y);
    x = ++x + y;
    System.out.println("Value of (++x + y)=x is "+x);
    System.out.println("Value of x: "+x);
    x = x++ + y ;    // Special case
    System.out.println("Value of (x++ + y)=x is "+x);
    System.out.println("Value of x: "+x);

    System.out.println("Value of x++ + y is "+ (x++ + y));
    System.out.println("Value of x: "+x);
     
    System.out.println("Value of ++x + y is "+ (++x + y));
    System.out.println("Value of x: "+x);
   
  }
}