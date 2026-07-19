class Solution {
public:
    string removeDuplicates(string s) {
        stack<char> st;
        string result = "";
        for(int i=0;i<s.length();i++){
            if(st.empty()){
                st.push(s[i]);
                continue;
            }
            char top = st.top();
            if(s[i]==top){
                st.pop();
                continue;
            }
            st.push(s[i]);
        }
        while(!st.empty()){
            result = result + st.top();
            st.pop();
        }
        reverse(result.begin(),result.end());
        return result;
    }
};