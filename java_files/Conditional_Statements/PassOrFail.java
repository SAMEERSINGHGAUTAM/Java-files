import java.util.*;

public class PassOrFail {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your marks:");
    int s = sc.nextInt();
    String type = ((s>=33)) ? "PASS" : "FAIL" ;
    System.out.println("You are :"+ type  );
  }
}