import java.util.*;

public class Prime {
  public static boolean Isprime(int N) {
    int div = 2;
    while(div<N) {
      if(N % div == 0) {
        break;
      } else {
        div++;
      }
    }
    if(div == N) {
      return true;
    } else {
      return false;
    }
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number:");
    int a = sc.nextInt();
    System.out.println(a+ " is prime: "+ Isprime(a));
  }
}