class Solution {
    public String convertToTitle(int columnNumber) {
        //stringbuilder to store the values.
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0){
            int n = (columnNumber-1)%26;
            sb.append((char)(n+'A'));
            columnNumber = (columnNumber - 1)/26;
        }
        // as we want the result in reverse order, and the return type is String
        return sb.reverse().toString();
    }
}

//https://leetcode.com/problems/excel-sheet-column-title/description/
