public int arrayPairSum(int[] nums){
    int n=nums.length,res=0;
    Arrays.sort(nums);
    //adding alternate element after the sorting will do the work.
    
    for(int i=0;i<n;i+=2){
        res+=nums[i];
    }
    return res;
    }
    
    
//https://leetcode.com/problems/array-partition/description/
