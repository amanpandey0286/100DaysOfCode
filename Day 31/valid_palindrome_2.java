class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                //else call the isPalindrome fuction and pass the string after skiping the current element one by one from both end.
                return (isPalindrome(s,i+1,j)||isPalindrome(s,i,j-1));
            }
        }  
        return true;      
    }

    //function to find if a string is palindrome or not.
    public boolean isPalindrome(String s ,int i, int j){
        while(i<=j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}
