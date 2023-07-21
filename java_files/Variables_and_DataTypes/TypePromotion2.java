import java.util.*;

public class TypePromotion2 {
  public static void main(String args[]) {
    char a ='a';
    char b ='b';
    System.out.println((int)b);
    System.out.println((int)a);
    int difference = b-a;
    byte ans = (byte)(b-a);
    System.out.println(difference+"\n"+ans);
  }
}