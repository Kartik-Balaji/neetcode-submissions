class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid;
                break;
            }
        }
        if(left>=nums.length) return -1;;
        if(nums[left]!=target) return -1;
        return left;
    }
}
