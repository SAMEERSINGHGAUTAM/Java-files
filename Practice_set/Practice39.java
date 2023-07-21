// Conditional Statements (Practice Question-2)

import java.util.*;

public class Practice39 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your body temperature:");
    double temp = sc.nextDouble();
    String status = (temp>100) ? "Fever" : "No fever";
    System.out.println(status);
  }
}