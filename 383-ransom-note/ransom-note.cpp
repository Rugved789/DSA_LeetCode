class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        unordered_map <char,int> need;
        unordered_map <char,int> have;

        for(int i=0;i<ransomNote.length();i++){
            need[ransomNote[i]]++;
        }

        for(int i=0;i<magazine.length();i++){
            have[magazine[i]]++;
        }

        for(auto i : need){
            char ch = i.first;
            int needval = i.second;
            int haveval = have[ch];
            if(needval>haveval){
                return false;
            }
        }
        return true;
    }
};