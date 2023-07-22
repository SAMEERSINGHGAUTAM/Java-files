import java.util.*;

public class Input {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Statement:");
      String b = sc.nextLine(); // error - not taking input 
      System.out.println("Integer:");
      int a = sc.nextInt();
      
      System.out.println("byte:");
      byte c = sc.nextByte();
      System.out.println("short:");
      short d = sc.nextShort();
      System.out.println("long:");
      long e = sc.nextLong();
      System.out.println("Word:");
      String f = sc.next();
      System.out.println("Float:");
      float g = sc.nextFloat();
      System.out.println("Double:");
      double h = sc.nextDouble();
      System.out.println("Enter true:");
      boolean i = sc.nextBoolean();
      System.out.println("Entered values are: "+a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i);

   }
}