class Solution {
    public int maxArea(int[] height) {
        int maxcap=0;
        int start=0;
        int end=height.length-1;

        while(start<end){
            int width = end-start;
            int hei = Math.min(height[start],height[end]);
            int cap = width*hei;
            maxcap=Math.max(maxcap,cap);

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