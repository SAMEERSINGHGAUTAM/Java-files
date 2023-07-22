 // Unary Operators
public class Practice3 {
  public static void main(String args[]) {
    int x = 25, y = 20;
    System.out.println("value of x and y: "+ x + "\t" + y);
    x = x + y++;
    
    System.out.println("Value of (x + y++) is: "+ (x));
    System.out.println("value of x and y : "+x +"\t"+ y);

    x = x + ++y;
    System.out.println("Value of (x + ++y) is "+ (x));
    System.out.println("Value of x and y : "+x +"\t"+ y);

    System.out.println("Value of (x++ + ++y) is: "+ (x++ + ++y));
    System.out.println("Value of x and y : "+x + "\t"+ y);
  }
}