class Solution {

    public :
    bool isPalindrome(int x) {
        long long temp=x ;
        long long res = 0;

        
        if(x<0)
            return false;
      
        while(x>0)
        {
             res *= 10;
            res+= x % 10;
            x /= 10;
            
        }
        
        return res==temp?true:false;
        
    }

};

    
    

