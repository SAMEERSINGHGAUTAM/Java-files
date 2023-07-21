import java.util.*;

public class IncomeTax {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your income:");
    int a = sc.nextInt();
    int Tax;

//     if(a<0.5E6) {
//      System.out.println("Income tax: "+(a*(0)));
//     } else if(a>0.5E6 && a <= 0.1E7) {
//       System.out.println("Income tax: "+(a*(0.2f)));
//     } else {
//       System.out.println("Income tax: "+(a*(0.3f)));
//     }
//   }
// }

if(a<0.5E6) {
  Tax = 0;
} else if(a>0.5E6 && a<0.1E7) {
  Tax = (int)(0.2f*a);
} else {
  Tax = (int)(0.3f*a);
}

System.out.println("Your tax is : "+Tax);

}

}