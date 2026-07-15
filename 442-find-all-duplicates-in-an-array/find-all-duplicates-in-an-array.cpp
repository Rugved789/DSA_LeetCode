class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        unordered_map <int,int> mp;
        vector<int> vc;

        for(auto i : nums){
            mp[i]++;
        }
        for(auto i : mp){
            if(i.second>=2){
                vc.push_back(i.first);
            }
        }
        return vc;
    }
};