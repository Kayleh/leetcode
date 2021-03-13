#include "iostream"
#include "vector"
#include "unordered_map"

using namespace std;

//输入: [1,2,3,1]
//输出: true
class Solution
{
public:
    bool containsDuplicate(vector<int> &nums)
    {
        unordered_map<int, int> map;
        for (int num : nums)
        {
            map[num]++;
            if (map[num] > 1) return true;
        }
        return false;
    }
};

