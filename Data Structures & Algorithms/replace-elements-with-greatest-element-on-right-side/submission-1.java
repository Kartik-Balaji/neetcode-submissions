class Solution {
    public int[] replaceElements(int[] arr) {
        int currmax=-1000000;
        int maxsub[]=new int[arr.length];
        maxsub[arr.length-1]=-1;
        if(arr.length==1) return maxsub;
        for(int i=arr.length-1;i>=1;i--){
            currmax=Math.max(currmax,arr[i]);
            maxsub[i-1]=currmax;
        }
        maxsub[0]=currmax;
        return maxsub;
    }
}