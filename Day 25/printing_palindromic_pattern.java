public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
            //for initial spaces.
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //for first half no.
            for(int j = 1; j <= i; j++ ){
                System.out.print(i-j+1);
            }
            //for printing no after first half.
            for(int j = 2; j<= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

/* To print Palindromic pattern.

    1
   212
  32123
 4321234
543212345

*/
