class Solution {
    public boolean isAnagram(String s, String t) {
        char [] sCharArray = s.toCharArray();
        char [] tCharArray = t.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        for(int i = 0; i<sCharArray.length; i++){
            if(sCharArray.length != tCharArray.length){
                return false;
            }
        
            else if(sCharArray[i] != tCharArray[i]){
                    return false;
            }
        }
        return true;
    }
}

//https://leetcode.com/problems/valid-anagram/description/
