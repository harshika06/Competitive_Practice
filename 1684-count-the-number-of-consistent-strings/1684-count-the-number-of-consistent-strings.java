class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
         int count=0;
        for(int i=0; i<words.length; i++){
            if(contains(words[i],allowed)) count++;
        }
        return count;
    }
    
    public boolean contains(String temp,String allowed){
            for(int j=0; j<temp.length(); j++){
                if(allowed.indexOf(temp.charAt(j))<0) return false; 
            }
        
        return true;
    }
     
        
        
             
        
        
        
    
}