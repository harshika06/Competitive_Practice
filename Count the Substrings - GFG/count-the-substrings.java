//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.countSubstring(S);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int countSubstring(String S) 
    { 
          int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            int count_upper = 0, count_lower = 0;
            for (int j = i; j < S.length(); j++) {
                if (S.charAt(j) >= 'a' && S.charAt(j) <= 'z') {
                    count_lower++;
                } else {
                    count_upper++;
                }
                if (count_upper == count_lower) {
                    ans++;
                }
            }
        }
        return ans;
        
        // code here
    }
} 
   