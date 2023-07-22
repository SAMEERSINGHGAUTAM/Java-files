import java.util.*;

public class Product {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    float a = sc.nextFloat();
    System.out.println("Enter a second number");
    float b = sc.nextFloat();
    // System.out.println("Enter a third number");
    // float c = sc.nextFloat();
    float product = a*b*3.6f ;
    System.out.println("Product is "+product);
  } 
}