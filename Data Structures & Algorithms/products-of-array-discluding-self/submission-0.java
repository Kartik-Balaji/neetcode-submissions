class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] P =new int[nums.length];
        P[0]=1;
        int suff=1;
        for(int i=1;i<nums.length;i++){
            P[i]=P[i-1]*nums[i-1];
            System.out.println(P[i]);
        }
        for(int i=nums.length-1;i>=0;i--){
            P[i]=P[i]*suff;
            suff*=nums[i];
        }
        
        return P;
    }
}