import java.util.*;

public class LargestOf2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int a = sc.nextInt();
    System.out.println("Enter the second number:");
    int b = sc.nextInt();

    if(a<b) {
      System.out.println("Second number: "+b);
    }
    else {
      System.out.println("First number: "+a);
    }
  }
}