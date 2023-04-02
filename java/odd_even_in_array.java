// Sunday April 2,10:54:12 Pm
// https://practice.geeksforgeeks.org/problems/even-odd-sum5450/1?page=4&difficulty[]=-2&status[]=unsolved&sortBy=difficulty
class Solution {
    ArrayList<Integer> EvenOddSum(int N, int Arr[]) {
        // code here
        int even=0;
        int odd=0;
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for(int i=0;i<N;i++){
            if(i%2 == 0){
                even += Arr[i];
            }else{
                odd += Arr[i];
            }
        }
        ls.add(even);
        ls.add(odd);
        return ls;
    }
}