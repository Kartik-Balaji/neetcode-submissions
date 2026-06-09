class Solution {
    public int[] twoSum(int[] numbers, int temp) {
        int left=0;
        int res[]=new int[2];
        int right=numbers.length-1;
        while(left<=right){
            int val=numbers[left]+numbers[right];
            if(val>temp){
                right--;
            }
            else if(val<temp){
                left++;
            }else{
                res[0]=left+1;
                res[1]=right+1;
                break;
            }
        }
        return res;
    }
}
