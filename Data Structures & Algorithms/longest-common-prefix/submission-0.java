class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strs[0].length();i++){
            int count=0;
            char look1=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){ 
                if(look1==strs[j].charAt(i)){
                    count++;
                }
            }
            if(count==strs.length-1){
                sb.append(look1);
            }
            else break;
        }
        return sb.toString();
    }
}