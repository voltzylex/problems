// Tuesday April 4, 6;02;42 PM
// https://practice.geeksforgeeks.org/problems/series-ap5310/1?page=1&difficulty[]=-2&status[]=unsolved&sortBy=submissions
class Solution {
    int nthTermOfAP(int A1, int A2, int N) {

       int d,a=0;

       d=A2-A1;

       a=A1+(N-1)*d;

       return a;

    }
}