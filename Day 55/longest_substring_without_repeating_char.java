class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0, right = 0, max = 0;
        Set<Character> longSub = new HashSet();

        while(right < s.length()){
            char c = s.charAt(right);
            if(longSub.add(c)){
                max = Math.max(max, right-left+1);
                right++;
            }else{
                while(s.charAt(left) != c){
                    longSub.remove(s.charAt(left));
                    left++;
                }
                longSub.remove(c);
                left++;
            }
            
        }
        return max;
        
        
    }
}

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
