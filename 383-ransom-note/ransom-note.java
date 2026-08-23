class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> have_mp = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
            have_mp.put(ch,have_mp.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char need_ch = ransomNote.charAt(i);
            int current_count = have_mp.getOrDefault(need_ch,0);

            if(current_count==0){
                return false;
            } 
            have_mp.put(need_ch,current_count-1);
        }
        return true;
    }
}