class Solution {
    public int removeElement(int[] nums, int val) {
        int[] res=new int[nums.length];
        int count=0;
        int pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                res[pos]=nums[i];
                pos++;
            }
            else{
                count++;
            }
        }
        for(int i=0;i<pos;i++){
            nums[i]=res[i];
        }
        return nums.length-count;

    }
}