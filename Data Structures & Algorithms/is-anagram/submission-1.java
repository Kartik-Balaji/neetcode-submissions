class Solution {
    public boolean isAnagram(String s, String t) {
        char schar[]=s.toCharArray();
        char tchar[]=t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);
        if(s.length()!=t.length()) return false;
        for(int i=0;i<schar.length;i++){
            if(schar[i]!=tchar[i]){
                return false;
            }
        }
        return true;
    }
}
