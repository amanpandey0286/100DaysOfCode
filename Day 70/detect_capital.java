class Solution {
    public static boolean detectCapitalUse(String word) {
        int l=word.length();
        boolean res= false;
        int c=0;
        for (int i = 0; i <l ; i++) {
            if((int)word.charAt(i)<=90)
                c++;
        }
        if(l==c)
            res=true;
        else
        {
            if(c==1)
            {
                if((int)word.charAt(0)<=90)
                    res=true;
                else
                    res=false;
            }
            if(c==0)
                res=true;
        }
        return res;
    }
}


//https://leetcode.com/problems/detect-capital/description/
