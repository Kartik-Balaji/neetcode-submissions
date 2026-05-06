class Solution {
    public boolean isMonotonic(int[] nums) {
        int countinc=0;
        int countdec=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                countinc++;
            }
            if(nums[i]<=nums[i+1]){
                countdec++;
            }
        }
        System.out.println(countinc+" "+countdec);
        if(countinc==nums.length-1 || countdec==nums.length-1){
            return true;
        }
        return false;
    }
}