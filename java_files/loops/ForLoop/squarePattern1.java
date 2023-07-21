import java.util.*;

public class squarePattern1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int j = sc.nextInt();

    for(int i = 1 ; i <= j ; i++) {
      for(int k = 1; k <= j ; k++) {
        System.out.print("*"+" ");
      }
      System.out.print("\n");
    }
  }
}