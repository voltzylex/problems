// User function template for Java
// Thursday March 30,10:47:46 PM 
// https://practice.geeksforgeeks.org/problems/java-strings-set-15112/1?page=2&difficulty[]=-2&status[]=unsolved&sortBy=submissions
class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        String value = S1+S2;
        String reverse="";
        char ch;
        for(int i =value.length()-1;i>=0;--i){
            ch =  value.charAt(i);
            reverse = reverse+ch;
        }
        return reverse;
    }
}