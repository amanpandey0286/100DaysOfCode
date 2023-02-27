class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length - 1;
        Arrays.sort(nums);
        //if array consist of both -ve and +ve integer then either the product of last 3 no will be maxm.
        // or the product of starting 2 value (form +ve) and last value(which will be maxm in +ve) will me maxm.
        int ans = Math.max(nums[0]*nums[1]*nums[n], nums[n-2]*nums[n-1]*nums[n]);
        return ans;
        
    }

}

//https://leetcode.com/problems/maximum-product-of-three-numbers/description/
