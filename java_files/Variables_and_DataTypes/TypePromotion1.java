import java.util.*;

public class TypePromotion1 {
  public static void main(String args[]) {
    char a = 'a'; // int(97)
    byte b = 23; // int(23)
    short c = 567; // int(567)
    byte ans = (byte)(a+b+c); // 

    System.out.println("Sum of 'a'+ b + c is "+(a+b+c)+"\n"+ans);
  }
}