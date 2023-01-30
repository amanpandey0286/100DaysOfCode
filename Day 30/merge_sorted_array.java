public void merge(int[] nums1, int m, int[] nums2, int n) {
        //merges both the array 
        for(int i = 0; i<n;i++){
            nums1[m+i] = nums2[i];
        }
        //then sorted
        Arrays.sort(nums1);
        
    }


//https://leetcode.com/problems/merge-sorted-array/description/
