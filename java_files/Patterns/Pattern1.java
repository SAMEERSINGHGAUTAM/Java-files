// Nested for loops
/*
      *
      * *
      * * *
      * * * *
*/

public class Pattern1 {
        public static void main(String pattern[]) {
            for(int lines = 1; lines <= 4; lines++) { // Number of lines to print
            // One line
                for(int stars = 1; stars <= lines; stars++) {  // Inner loop
                    System.out.print("*");
                }
             System.out.println();
            }
        }
}