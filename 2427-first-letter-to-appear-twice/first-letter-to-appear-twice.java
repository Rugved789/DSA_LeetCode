class Solution {
    public char repeatedCharacter(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(mp.containsKey(ch)){
                return ch;
            }
            else{
                mp.put(ch,1);
            }
        }
        return ' ';
    }
}