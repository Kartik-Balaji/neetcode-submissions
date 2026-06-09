class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max=1;
        int temp=1;
        int curr=0;
        if(nums.length==0) return 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]) continue;
            if(nums[i+1]-1==nums[i]) {
                temp++;
            }
            else temp=1;
            max=Math.max(max,temp);
        
            
            
        }
        return max;
    }
}
