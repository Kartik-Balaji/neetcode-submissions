class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length/2;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:map.keySet()){
            System.out.println(map.get(num)+" "+num);
            if(map.get(num)%2!=0) return false;
        }
        return true;

    }
}