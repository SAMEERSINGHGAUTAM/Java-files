import java.util.*;

public class Circle {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of the circle");
    float r = sc.nextFloat();
    float area = (3.141f) * r * r;
    System.out.println("Area of the circle "+area);
  }
}