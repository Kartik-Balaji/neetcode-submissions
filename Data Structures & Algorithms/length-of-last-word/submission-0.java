class Solution {
    public int lengthOfLastWord(String s) {
        String[] spliting=s.split(" ");
        return spliting[spliting.length-1].length();
    }
}