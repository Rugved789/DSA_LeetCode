class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int start=0;
        int end=nums.length-1;
        int index=nums.length-1;

        while(start<=end){
            int leftsq=nums[start]*nums[start];
            int rightsq=nums[end]*nums[end];
            if(leftsq>rightsq){
                ans[index]=leftsq;
                index--;
                start++;
            }
            else{
                ans[index]=rightsq;
                index--;
                end--;
            }

        }
        return ans;
    }
}