public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            //for initial spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //for stars equal to n in every line.
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

    } 


/* To print solid rhombus.

    *****
   *****
  *****
 *****
*****

*/
