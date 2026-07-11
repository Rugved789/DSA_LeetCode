class Solution {
    public int maxArea(int[] height) {
        int max_water=0;
        int  i=0;
        int j = height.length-1;

        while(i<j){
            int width = j-i;
            int hei = Math.min(height[i],height[j]);
            int current=width*hei;
            max_water = Math.max(max_water,current);

            if( height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max_water;
    }
}