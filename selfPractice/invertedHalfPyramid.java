// Inverted & rotated half-pyramid pattern
/*                *
                * *
              * * *
            * * * *
*/

import java.util.*;

    public class invertedHalfPyramid {
        public static void main(String args[]) {
             Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();

             for(int i = 1 ; i <= n ; i++) {
                    for(int j = n ; j >= 1 ; j--) {
                        if(j-i > 0) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
             }
        }
    }