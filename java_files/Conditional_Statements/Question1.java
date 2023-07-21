//  Write a java program to get a number from the user and print whether it is positive or negative.

import java.util.*;

public class Question1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    float a = sc.nextFloat();
    String b = (a>=0) ? "Positive" : "Negative" ;
    System.out.println(b);
  }
}