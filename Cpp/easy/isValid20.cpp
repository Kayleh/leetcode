#include "iostream"
#include "unordered_map"
#include "stack"

using namespace std;

class Solution
{
public:
    bool isValid(string s)
    {
        unordered_map<char, int> m{{'(', 1},
                                   {'[', 2},
                                   {'{', 3},
                                   {')', 4},
                                   {']', 5},
                                   {'}', 6}};

        stack<char> st;
        bool isTrue = true;
        for (char ch:s)
        {
            int flag = m[ch];
            if (flag >= 1 && flag <= 3)st.push(ch);
            else if (!st.empty() && m[st.top()] == flag - 3)st.pop();
            else
            {
                isTrue = false;
                break;
            }
        }
        if (!st.empty())isTrue = false;
        return isTrue;
    }
};

