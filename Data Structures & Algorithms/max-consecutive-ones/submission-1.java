class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int tempmax=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)tempmax++;
            else{
                tempmax=0;
            } 
            max=Math.max(max,tempmax);
        }
        return max;
    }
}