#include "iostream"
#include "vector"

using namespace std;

class Solution
{
public:
    int findString(vector<string> &words, string s)
    {
        int left = 0;
        int right = words.size();
        while (left < right)
        {
            int mid = (left + right) / 2;
            if (words[left] == s)
            {
                return left;
            } else if (words[left] != s && words[mid] == "")
            {
                left++;
                continue;
            }

            if (words[mid] == s)
            {
                return mid;
            } else if (words[mid].compare(s) > 0)
            {
                right = mid;
            } else if (words[mid].compare(s) < 0)
            {
                left = mid + 1;
            }
        }
        return -1;
    }
};

