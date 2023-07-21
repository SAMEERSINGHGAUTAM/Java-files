import java.util.*;

public class reverseNumber {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    int a = 0, num1 = num;

    while(num>0) {
      num /= 10;
      a++;
    }
    a -= 1 ;
    int i = 0;
    num = 0;
    while(num1>0) {
      i = num1 % 10;
      num1 /= 10;
      num += i*Math.pow(10,a);

      a--;
      if(a<0) 
      break;
    }
    System.out.println(num);
  }
}