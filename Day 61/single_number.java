class Solution {
    public int singleNumber(int[] nums) {
        // Initialize the unique number...
        int uniqNum = 0;
        // TRaverse all elements through the loop...
        for (int idx : nums) {
            // Concept of XOR...
            uniqNum ^= idx;
        } return uniqNum;       // Return the unique number...
    }
}


//https://leetcode.com/problems/single-number/description/
