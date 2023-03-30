//  Thursday March 30,10:37:09 PM

// https://practice.geeksforgeeks.org/problems/java-if-else-decision-making0924/1?page=2&difficulty[]=-2&status[]=unsolved&sortBy=submissions
//User function Template for Java
class Solution{
    static String compareNM(int n,int m){
        // code here
        if(n>m){
            return "greater";
        }
        else if(m>n){
            return "lesser";
        }
        else{
            return "equal";
        }
    }
}