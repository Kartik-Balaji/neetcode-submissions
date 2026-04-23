class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()) return false;
        if(s.equals("")) return true;
        int spos=0;
        for(int i=0;i<t.length();i++){
            if(spos==s.length()) return true;
            if(s.charAt(spos)==t.charAt(i)){
                spos++;
            }
        }
        if(spos!=s.length()) return false;
        else return true;
    }
}