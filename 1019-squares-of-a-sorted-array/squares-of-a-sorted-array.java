class Solution {
    public int[] sortedSquares(int[] nums) {
        int start=0;
        int end = nums.length-1;;
        int index = nums.length-1;
        int result[]= new int[nums.length];
        while(start<=end){
            int leftSquare = nums[start]*nums[start];
            int rightSquare = nums[end]*nums[end];

            if(leftSquare > rightSquare){
                result[index]=leftSquare;
                start++;
            }
            else{
                result[index]=rightSquare;
                end--;
            }
            index--;
        }
        return result;
    }
}