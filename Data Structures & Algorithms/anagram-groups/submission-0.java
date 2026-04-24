class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        List<String> temparr=new ArrayList<>();
        for(String word:strs){
            char[] temp=word.toCharArray();
            Arrays.sort(temp);
            String sorted=new String(temp);
            temparr.add(sorted);
        }
        for(int i=0;i<strs.length;i++){
            List<String> var=new ArrayList<>();
            if(temparr.get(i).equals(".")){
                continue;
            }
            else{
            var.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                if(temparr.get(j).equals(".")){
                    continue;
                }
                if(temparr.get(i).equals(temparr.get(j))){
                    var.add(strs[j]);
                    temparr.set(j,".");
                }
            }
            }
            res.add(var);
        }
        
        return res;
    }
}