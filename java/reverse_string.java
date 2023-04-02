// Sunday April 2,19:32:19 PM 
// https://practice.geeksforgeeks.org/problems/java-reverse-a-string0416/1?page=2&difficulty[]=-2&status[]=unsolved&sortBy=submissions
class Solution {
    static String revStr(String S) {
        // code here
       
        String value = "";
        for(int i=S.length()-1;i>=0;--i){
        
            value += S.charAt(i);
        }
        return value;
    }
}