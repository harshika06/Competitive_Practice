//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.maxInstance(s);
            out.println(ans);
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

 class Solution {
    public int maxInstance(String s) {
        // Code here
        if(s.length()<7)
          return 0;
        int [] freq=new int[26];
        for(char ch:s.toCharArray())
        {
            freq[ch-'a']++;
        }
        
        String str="balloon";
        int count=0;
        int flag=0;
        while(true)
        {
            for(char ch:str.toCharArray())
            {
                int val=freq[ch-'a']--;
                if(val<=0)
                {
                    flag=-1;
                    break;
                }
            }
             
             if(flag==-1)
             break;
             
             count++;
        }
        
        return count;
    }
}