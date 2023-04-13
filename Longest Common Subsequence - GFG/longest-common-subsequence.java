//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        int dp[][] = new int[s1.length()][s2.length()];
        for(int a[] : dp)
        {
            Arrays.fill(a,-1);
        }
      return  longestcommonsubsequence(s1,s2,0,0,dp);
        
        // your code here
    }
    static int longestcommonsubsequence(String s1 , String s2 , int index1 , int index2 , int dp[][])
    {
        if(index1>=s1.length() || index2>=s2.length())
        {
            return 0 ;
        }
        
        if(dp[index1][index2]!=-1)
        {
            return dp[index1][index2];
        }
        int take = 0;
        int notake = 0;
        if(s1.charAt(index1) == s2.charAt(index2))
        {
            take = 1+longestcommonsubsequence(s1,s2,index1+1,index2+1,dp);
        }
        else
        {
            notake = Math.max(longestcommonsubsequence(s1,s2,index1+1,index2,dp),longestcommonsubsequence(s1,s2,index1,index2+1,dp));
            
        }
        
        return dp[index1][index2] = Math.max(take,notake);
    }
    
    
}