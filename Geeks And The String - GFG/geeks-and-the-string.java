//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s; 
            s = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.removePair(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String removePair(String s) {
        // code here
         if(s.length()==0)
            return "-1";
        if(s.length()==1)
            return s;
            
        if(s.charAt(1)==s.charAt(0)){
            s = removePair(s.substring(2));
            return s;
        }    
            
        for(int i=2; i<s.length(); i++){
            if(s.charAt(i)==s.charAt(i-1)){
                s = removePair(s.substring(0,i-1)+s.substring(i+1));
                break;
            }
        } 
        return s;
    }
}
        
