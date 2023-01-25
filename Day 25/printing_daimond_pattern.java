public static void main(String[] args) {

        int n = 4;
        //for upper half
        for (int i = 0; i <= n; i++) {
            //for spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            //for initial half row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //for half row after the initial
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //same for the lower half.
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


/* To print diamond pattern

   *
  ***
 *****
*******
*******
 *****
  ***
   *
*/
