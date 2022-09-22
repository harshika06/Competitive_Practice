class Solution {
    public String reverseWords(String s) {
         if(s.length() == 1)
{
return s;
}
char[]arr = s.toCharArray();
int fp=0,ep=0;
for(int i=0; i<arr.length; i++)
{
if(arr[i] == ' ')
{
ep = i-1;
while(fp<=ep)
{
char temp = arr[fp];
arr[fp] = arr[ep];
arr[ep] = temp;
fp++;
ep--;
}
fp = i+1;
}
else if(i == arr.length-1)
{
ep = arr.length-1;
while(fp<=ep)
{
char temp = arr[fp];
arr[fp] = arr[ep];
arr[ep] = temp;
fp++;
ep--;
}
fp = arr.length-1;
}
}

    return new String(arr);
        
        
        
    
        
        
    
        
    }
}