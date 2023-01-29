public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        //declaration of new array.
        int[] ans = new int[2*n];
        //for loop to initialize elements at index.
        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[n+i] = nums[i];
        }
        return ans;
    } 

//https://leetcode.com/problems/concatenation-of-array/submissions/
