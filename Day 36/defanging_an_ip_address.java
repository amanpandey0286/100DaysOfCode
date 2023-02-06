class Solution {
    public String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        for(char x:address.toCharArray()){
            if(x=='.')str.append("[.]");
            else str.append(x);
        }
        return str.toString();
    }
}


//https://leetcode.com/problems/defanging-an-ip-address/description/
