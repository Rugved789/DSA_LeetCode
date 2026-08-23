class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sec = target-nums[i];
            if(mp.containsKey(sec)){
                result[0]=i;
                result[1]=mp.get(sec);
            }
            else{
                mp.put(nums[i],i);
            }
        }
        return result;
    }
}