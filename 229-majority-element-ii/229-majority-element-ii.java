class Solution {
    public List<Integer> majorityElement(int[] nums) {
           int num1 = -1, num2 = -1;
        int count1 = 0, count2 = 0;
        
        for (int n : nums) {
            if (n == num1) count1++;
            else if (n == num2) count2++;
            else if (count1 == 0) {
                num1 = n;
                count1 = 1;
            } else if (count2 == 0) {
                num2 = n;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        count1 = count2 = 0;
        
        for (int n : nums) {
            if (n == num1) count1++;
            else if (n == num2) count2++;
        }
        
        if (count1 > nums.length / 3) ans.add(num1);
        if (count2 > nums.length / 3) ans.add(num2);
        
        return ans;
    }
        
        
        
        
    }
