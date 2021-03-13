#include "iostream"

using namespace std;

class Solution
{
public:
    string reverseLeftWords(string s, int n)
    {
        s = s + s.substr(0, n);
        return s.substr(n, s.size());
    }
};

//int main()
//{
//    string s = "abcdefg";
//    Solution solution;
////    cdefgab
//    cout << solution.reverseLeftWords(s, 2) << endl;
//}

//输入: str="abcdefg", offset = 1     gabcdefg
//输出: str = "gabcdef"
//样例解释: 注意是原地旋转，即str旋转后为"gabcdef"
//str = str.substr(str.size()-offset,str.size())+str;
//str=str.substr(0,str.size()-offset);