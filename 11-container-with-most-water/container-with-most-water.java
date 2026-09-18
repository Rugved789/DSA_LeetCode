class Solution {
    public int maxArea(int[] height) {
        int maxcap=0;
        int currcap=0;
        int start=0;
        int end=height.length-1;

        while(start<end){
            int width = end-start;
            int hei = Math.min(height[start],height[end]);
            currcap = width*hei;
            maxcap=Math.max(currcap,maxcap);
            if(height[start]<height[end]){
                start++;
            } 
            else{
                end--;
            }
        }
        return maxcap;
    }
}