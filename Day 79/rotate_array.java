import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int [] nums = new int[N];  
        for(int i = 0; i< N; i++){
            nums[i] = input.nextInt();
        }
        int K = input.nextInt();
        int [] newNums = new int[N];
        for(int i =0 ; i<N; i++){
            newNums[(i+K)%N] = nums[i];
        }
        for(int i = 0; i<N ; i++){
            System.out.print(newNums[i]+ " ");
        }
    }
}
