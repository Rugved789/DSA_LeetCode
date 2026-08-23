class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> mp = new HashMap<>();

        for(int num : nums){
            mp.put(num,mp.getOrDefault(num,0)+1);

            if(mp.get(num)>=2){
                ans.add(num);
            }
        }
        return ans;
    }
}