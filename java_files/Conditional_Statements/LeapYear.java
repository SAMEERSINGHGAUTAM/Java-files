 import java.util.*;

        public class LeapYear {
                public static void main(String[] args) {
            
               Scanner sc = new Scanner(System.in);
               System.out.println("Enter the year:");
               int A = sc.nextInt();
              
                if(A%4==0){
                String leap = (A%100==0) ? (A%400==0) ? "Leap year" : "not a leap year" : "Leap year"   ;  
                   System.out.println(leap);
               }  else {
                          
            System.out.println("not a leap year");
          }

                }
}
