class Solution {
public:
    int romanToInt(string s) {
        int a=0;
         int v[s.length()];
        for(int i=0;i< s.length();i++){
            switch(s[i]){
                    case 'I':{
                        v[i] = 1;break;
                    }
                    case 'V':{
                        v[i] = 5;break;
                    }
                    case 'X':{
                        v[i]=10;break;
                    }
                    case 'L':{
                        v[i]=50;break;
                    }
                    case 'C':{ 
                        v[i]=100;break;
                    }
                    case 'D':{
                        v[i]=500;break;
                    }
                    case 'M':{
                        v[i]=1000;break;
                    }
            }
            
        }
        int i;
        for(i=0;i< s.length()-1;i++){
            if (v[i] >= v[i+1]){
                a=a+v[i];
            }
            else{
                a= a-v[i];
            }
        }
        a += v[i];

        return a;
    }
    
};