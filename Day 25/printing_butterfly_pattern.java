public static void main(String[] args) {
        int n = 4;
        //butterfly upperpart
        for(int i = 1; i<=n; i++){
            //for initial stars
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            //for middle spaces
            for(int j =1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //for end stars
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //butterfly lowerpart
        for(int i = n; i>=1; i--){
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            for(int j =1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

/* To print butterfly pattern.

*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

*/
