class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> resultset = new HashSet<>();

        for(int num : nums1){
            set.add(num);
        }
        for(int n : nums2){
            if(set.contains(n)){
                resultset.add(n);
            }
        }
        int[] result = new int[resultset.size()];
        int idx=0;
        for(int num: resultset){
            result[idx++]=num;
        }
        return result;
    }
}