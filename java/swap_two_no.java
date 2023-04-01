// Swap two no
// https://practice.geeksforgeeks.org/problems/swap-two-numbers3844/1?page=2&difficulty[]=-2&status[]=unsolved&sortBy=submissions
// Staurday April 1,19:58:59 PM
class Solution{
    static List<Integer> get(int a,int b)
    {   
        ArrayList<Integer> al = new ArrayList<Integer>();
        // code here
        int tem;
         tem = a;
         a = b;
         b=tem;
         al.add(a);
         al.add(b);
        return al;
    }
}