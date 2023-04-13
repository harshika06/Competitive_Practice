//{ Driver Code Starts
import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    //taking count of stairs
		    int m = sc.nextInt();
		    
		    //creating an object of class DynamicProgramming
		    Solution obj = new Solution();
		    
		    //calling method countWays() of class
		    //DynamicProgramming
		    System.out.println(obj.countWays(m));
		    
		}
		
	}
}
// } Driver Code Ends


class Solution
{
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
        int dp [] = new int[n+1];
        Arrays.fill(dp,-1);
       return  stairs(n,dp);
        
        // your code here
    }
    int stairs(int n , int dp[])
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        int jump1 = stairs(n-1,dp);
        int jump2 = stairs(n-2,dp);
        
        
        return dp[n] = (jump1+jump2)%1000000007;
    }
}

