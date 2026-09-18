class Solution {
    public boolean rotateString(String s, String goal) {
        String merge = s+""+s;
        if(s.length()==goal.length() && merge.contains(goal)){
            return true;
        }
        return false;
    }
}