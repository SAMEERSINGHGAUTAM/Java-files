// optimized solution
import java.util.*;

public class reverseNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
    while(n>0) {
      reverse = (reverse*10) + (n%10);  // lastDigit = n % 10;
      n /= 10;
    }
       n = reverse;
      System.out.println(n);
    }
}