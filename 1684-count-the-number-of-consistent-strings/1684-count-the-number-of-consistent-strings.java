class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        
        for(String word : words){
             boolean isPresent = true;
            char[] ch = word.toCharArray();
            
            for(char c : ch){ 
                if(!allowed.contains(String.valueOf(c))) {
                    isPresent = false;
                    break;
                }
            }
            if(isPresent)count ++;
        }
 return count ;   
        
        
             
        
        
        
    }
}