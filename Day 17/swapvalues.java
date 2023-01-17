// code to swap values without creating extra variable.
public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N1 = input.nextInt();
        int N2 = input.nextInt();
        N1= N1+N2;
        N2 = N1- N2;
        N1 = N1-N2;
        System.out.print(N1+ " ");
        System.out.print(N2);
    }
