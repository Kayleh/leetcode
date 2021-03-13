#include "iostream"
#include <vector>

using namespace std;

class Solution
{
public:
    string longestCommonPrefix(vector<string> &strs)
    {
        string res = strs.empty() ? "" : strs[0];
        for (string str:strs)
        {
            while (str.find(res) != 0)
            {
                res = res.substr(0, res.length() - 1);
            }
        }
        return res;
    }
};
//class Solution
//{
//public:
//    string longestCommonPrefix(vector<string> &strs)
//    {
//        if (!strs.size())
//            return "";
//        string prefix = strs[0];
//        int count = strs.size();
//        for (int i = 1; i < count; ++i)
//        {
//            prefix = longestCommonPrefix(prefix, strs[i]);
//            if (!prefix.size())
//                break;
//        }
//        return prefix;
//    }
//
//    string longestCommonPrefix(const string &str1, const string &str2)
//    {
//        int length = min(str1.size(), str2.size());
//        int Index;
//        while (Index < length && str1[Index] == str2[Index])
//            Index++;
//        return str1.substr(0,Index);
//    }
//};
