class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        if(s.length()==1) return 0;
        for(int i=1;i<s.length();i++){
            int temp=(int)s.charAt(i);
            int temp1=(int)s.charAt(i-1);
            sum+=Math.abs(temp-temp1);
            System.out.println(temp1);
            System.out.println(temp);
        }
        return sum;
    }
}