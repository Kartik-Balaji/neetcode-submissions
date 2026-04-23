class Solution {
    public int appendCharacters(String s, String t) {
        int tpos=0;
        for(int i=0;i<s.length();i++){
            if(tpos>=t.length())break;
            else if(t.charAt(tpos)==s.charAt(i)){
                tpos++;
            }
        }
        return t.length()-tpos;
    }
}