#include "string"
using namespace std;
class Solution
{
public:
    int strStr(string haystack, string needle)
    {
        string s;
        int len1 = haystack.size();
        int len2 = needle.size();
        if (len2 == 0)
        {
            return 0;
        }
        for (int pos = 0; pos <= len1 - len2; pos++)
        {
            s = haystack.substr(pos, len2);
            if (s == needle)
            {
                return pos;
            }
        }
        return -1;
    }
};

//读取字符串needle的长度，然后从0位置开始逐段切下haystaack和needle进行比较，如相等，则返回此时的位置。