import java.util.*;

public class TypePromotion7 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    a= (long)(a*67.5f);  // In case of float, (a=(long)(a*67.5)) is better format as compared to (a*=(long)67.5f)
    System.out.println(a);
  }
}