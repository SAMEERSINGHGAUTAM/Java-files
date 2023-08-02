// Print character pattern
/*     A
       B C
       D E F
       G H I J
*/

import java.util.*;

        public class Pattern4 {
                public static void main(String args[]) {
                    char A = 'A';
//                     int count = 0;
//                  Outer loop
                    for(int i = 1 ; i <= 5 ; i++) {
//                   Inner loop
                            for(int j = 1 ; j <= i ; j++) {
                                  System.out.print((A++)+ " ");
                            }
                            System.out.println();
                    }
                }
        }