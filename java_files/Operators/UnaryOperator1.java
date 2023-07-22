import java.util.*;

public class UnaryOperator1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    a++;
    System.out.println("a++: "+a);
    a--;
    System.out.println(a);
    ++a;
    System.out.println("++a: "+a);
    a--;
    System.out.println("value of a:"+ a);
    a--;
    System.out.println("a--:"+a);
    a++;
    System.out.println("value of a: "+a);
    --a;
    System.out.println("--a:"+a);
  }
}