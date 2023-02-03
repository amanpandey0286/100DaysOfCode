class Solution {
    public int fib(int n) {
        // as given if n =  0 the value of f(n) = 0 same for f(n) = 1.
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        // new array to  store value of the calculated value.
        int[] Fibonacci = new int[n+1];
        Fibonacci[0] = 0;
        Fibonacci[1] = 1;
        for(int i = 2; i < n+1; i++)
            Fibonacci[i] = Fibonacci[i-1] + Fibonacci[i-2];
        return Fibonacci[n];
    }
}

//https://leetcode.com/problems/fibonacci-number/description/
