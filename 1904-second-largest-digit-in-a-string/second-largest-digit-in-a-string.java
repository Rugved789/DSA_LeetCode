class Solution {
    public int secondHighest(String s) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                int digit = c-'0';

                if(digit>largest){
                    second=largest;
                    largest=digit;
                }
                else if(digit>second && digit!=largest){
                    second=digit;
                }
            }
        }
        return (second==Integer.MIN_VALUE) ? -1 : second;
    }
}