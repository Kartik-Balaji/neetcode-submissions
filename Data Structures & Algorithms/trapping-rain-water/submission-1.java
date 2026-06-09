class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=height.length-1;
        int water=0;
        int lmax=height[i];
        int rmax=height[j];
        while(i<j){
            if(lmax<rmax){
                i++;
                lmax=Math.max(lmax,height[i]);
                water+=lmax-height[i];
            }
            else{
                j--;
                rmax=Math.max(rmax,height[j]);
                water+=rmax-height[j];
            }

        }
        return water;
    }
}
