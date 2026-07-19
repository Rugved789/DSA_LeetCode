class Solution {
public:
    int maxArea(vector<int>& height) {
        int maxcap=0;
        int start=0;
        int end=height.size()-1;

        while(start<end){
            int width = end-start;
            int hei = min(height[start],height[end]);
            int cap = width*hei;

            maxcap=max(maxcap,cap);
            if(height[start]<height[end]){
                start++;

            }else{
                end--;
            }
        }
        return maxcap;
    }

};