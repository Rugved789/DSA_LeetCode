class Solution {
public:
    int sum(int num){
        int result =0;
        while(num>0){
            int digit = num%10;
            result = result+(digit*digit);
            num/=10;
        }
        return result;
    }
    bool isHappy(int n) {
        int slow = n;
        int fast = n;

        while(fast!=1){
            slow = sum(slow);
            fast = sum(fast);
            fast = sum(fast);

            if(slow==fast && fast!=1){
                return false;
            }
        }
        return true;
    }
};