import java.util.*;
  // !=
public class RelationOperator2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character literal: ");
    char a = sc.next().trim().charAt(0);
    int A = a;
    System.out.println("Enter a character literal: ");
    char b = sc.next().trim().charAt(0);
    int B = b;
    System.out.println("Is a not equal to b?"+ (A!=B));


  }
}