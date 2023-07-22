import java.util.*;

public class sumOfn {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = sc.nextInt();

    int counter =1, sum =0;
    while(counter <= num) {
      sum += counter;
      counter++;
    }
    System.out.println("Sum of first n natural numbers: "+ sum);
  }
}