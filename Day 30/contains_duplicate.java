public boolean containsDuplicate(int[] nums) {
        //sorted the arrays first
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-1;i++){
            //since the array  is sorted the same elements should be next to each other.
            if(nums[i] == nums[(i+1)]){
                return true;
            }
        }
        return false;
    }


//https://leetcode.com/problems/contains-duplicate/description/
