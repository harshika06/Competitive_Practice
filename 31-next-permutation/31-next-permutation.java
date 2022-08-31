class Solution {
    public void nextPermutation(int[] nums) {
     int len=nums.length;
int i=len-2;

    while(i>=0 && nums[i]>=nums[i+1])
        i--;
    if(i>=0){
        int j=len-1;
        while(j>i && nums[j]<=nums[i])
             j--;
        swap(nums,i,j);
    }
    reverse(nums,i+1,len-1);
}

    
    private void swap(int nums[],int i,int j){
        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
    }
    

    private void reverse(int nums[],int i,int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}
            
         
        

    
