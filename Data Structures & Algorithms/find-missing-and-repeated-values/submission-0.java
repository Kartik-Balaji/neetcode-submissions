class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid[0].length;
        int[] nums=new int[n*n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                nums[grid[i][j]]++;
                System.out.println(nums[grid[i][j]]+" "+grid[i][j]);
            }
        }
        int res[]=new int[2];
        for(int i=1;i<=n*n;i++){
            System.out.println(nums[i]);
            if(nums[i]==0) res[1]=i;
            if(nums[i]>1) res[0]=i;
        }
        return res;
    }
}