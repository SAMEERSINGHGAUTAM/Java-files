import java.util.*;

public class LogicalNot {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character: ");
    int A = sc.next().trim().charAt(0);
    System.out.println("A is greater than 0: "+ (A>0));
    System.out.println("!(A is greater than 0): "+ !(A>0));
    System.out.print("A is not greater than 0: "+ (A<0)+ "\n!(A is not greater than 0): "+ !(A<0)+"\n");

    System.out.println(A);
  }
}