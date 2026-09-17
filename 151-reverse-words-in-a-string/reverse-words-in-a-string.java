class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();


        String rev = new StringBuilder(s).reverse().toString();
        for(int i=0;i<n;i++){
            StringBuilder word = new StringBuilder();
            while(i<n && rev.charAt(i)!=' '){
                word.append(rev.charAt(i));
                i++;
            }
            if(word.length()>0){
                if(ans.length()>0){
                    ans.append(" ");
                }
                ans.append(word.reverse().toString());
            }
        }
        return ans.toString();
    }
}