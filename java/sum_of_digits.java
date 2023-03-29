
//User function Template for Java
// Wednesday March 29,10:30:16Pm
// https://practice.geeksforgeeks.org/problems/sum-of-digits1742/1?page=2&difficulty[]=-2&status[]=unsolved&sortBy=submissions
class Solution{
    static int sumOfDigits(int N) {
        // code here
         int sumOfDigit = 0;
        int rem;
        while(N!=0){
            rem = N%10;
            sumOfDigit += rem;
            N /=10;
        }
        return sumOfDigit;
    }
}
       