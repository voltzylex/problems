/User function Template for Java

// 10:01:53 pm March 28

class Solution
{
    int number = 1;
    
  public void printNos(int N)
    {
        //Your code here
        // int number = 1;
        if(number<=N){
            System.out.print(number+" ");
            number++;
            printNos(N);
        }
    }
}