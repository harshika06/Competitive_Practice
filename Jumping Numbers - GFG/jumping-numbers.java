//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.jumpingNums(X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static long jumpingNums(long X) {
        Queue<Long> q=new LinkedList<>();

        

        for(long i=1;i<=9;i++)

        {

            q.offer(i);

        }

        

        long maxi=Long.MIN_VALUE;

        

        while(q.size()>0)

        {

            long nd=q.remove();

            if(nd>X)

            continue;

            else

            maxi=Math.max(maxi,nd);

            

            long rem=nd%10;

            

            if(rem!=9)

            {

                long num=nd*10+rem+1;

                q.offer(num);

            }

            

            if(rem!=0)

            {

                long num=nd*10+rem-1;

                q.offer(num);

            }

        }

        return maxi;
        // code here
    }
};