public int[] runningSum(int[] nums) {
        //new array
        int[] runningsum = new int[nums.length];
        //loop to traverse the index of array
        for(int i = 0; i<nums.length; i++){
            int sum = 0;
            //loop to traverse from index 0 to ith every time.
            for(int j =0;j<=i;j++){
                sum = sum + nums[j];
            }
            runningsum[i] = sum;
        }
        return runningsum;
    }
