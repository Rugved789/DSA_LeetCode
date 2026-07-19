class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        unordered_map<int,int>mp;
        vector<int> result;

        for(auto i : nums){
            mp[i]++;
        }
        for(auto i : mp){
            if(i.second>=2){
                result.push_back(i.first);
            }
        }
        return result;
    }
};