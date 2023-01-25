public static void main(String[] args) {
        int n = 4;//no. of columns or rows.
        
        //for loop for no of columns
        for(int i = 1; i<=n; i++){
            //for loop to print extra space in row.
            for(int j1 = 1; j1 <= (n-i);j1++){
                System.out.print("  ");
            }
            // for loop to print stars in row.
            for(int j2 = 1; j2<=(i); j2++){
                System.out.print("* ");
            }
            //println to change the line.
            System.out.println();
        }
    }



/*  To print 

      * 
    * *
  * * *
* * * *

*/
