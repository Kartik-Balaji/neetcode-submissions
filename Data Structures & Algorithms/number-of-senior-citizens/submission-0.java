class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++){
            String temp=details[i];
            int num=((int)temp.charAt(11)-48)*10+((int)temp.charAt(12)-48);
            if (num>60 ) count++;
        }
        return count;
    }
}