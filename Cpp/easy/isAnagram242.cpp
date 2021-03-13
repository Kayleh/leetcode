#include "iostream"

using namespace std;

class Solution
{
public:
    bool isAnagram(string s, string t)
    {
        int record[26] = {0};
        int i;
        for (i = 0; i < s.size(); ++i)
            record[s[i] - 'a']++;
        for (i = 0; i < t.size(); ++i)
            record[t[i] - 'a']--;
        for (i = 0; i < 26; ++i)
            if (record[i] != 0)
                return false;
        return true;
    }
};

