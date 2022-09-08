class Solution {
    public String reverseWords(String str) {
        str=str.trim();
        String [] arr = str.split("\\s+");
        String res="";
        for(int i = arr.length-1;i>0;i--)
        {
            res+=arr[i]+" ";
            
        }
        res+=arr[0];
        return res;
        
    }
    
}