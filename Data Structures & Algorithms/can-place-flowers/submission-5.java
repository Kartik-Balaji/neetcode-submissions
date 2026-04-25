class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length==1){
            if(flowerbed[0]==0)n--;
        } 
        else{
        for(int i=0;i<flowerbed.length;i++){

            if(i==0){
                if(flowerbed[i+1]==0 && flowerbed[i]==0){
                n--;
                flowerbed[i]=1;
                }
                else continue;
            }
            else if(i==(flowerbed.length-1)){
                
             if(flowerbed[i-1]==0 && flowerbed[i]==0){
                n--;
                flowerbed[i]=1;
            }
            else continue;
            }
            else {
                
                if(flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i]==0){
                n--;
                flowerbed[i]=1;
            }
            System.out.println(i+" "+n);
            }
        }
        }
        if(n<=0) return true;
        return false;
    }
}