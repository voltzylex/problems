// Sum of Array Elements
// Monday March 27 , 10:30:50 PM
// https://practice.geeksforgeeks.org/problems/sum-of-array-elements2502/1?page=1&difficulty[]=-2&sortBy=submissions

class Get
{
    public static int sumElement(int arr[], int n)
    {
        // Your code here
        int sum =0;
       for(int i=0;i<arr.length;i++){
           sum += arr[i];
       }
        return sum;
    }
}
