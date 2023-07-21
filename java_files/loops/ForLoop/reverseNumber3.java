import java.util.*;

public class reverseNumber3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double sum=0;
    int i=-1;
    while(n>0) {
       sum += (n%10)*Math.pow(10,i);
       n/=10;
       i--;
    }
    n = (int)(sum*Math.pow((1.0/10),i+1))+1 ;   // due to loosy conversion
    System.out.println(n);
    
  }
}