#include "iostream"
#include "vector"

using namespace std;

class Solution
{
public:
    int removeDuplicates(vector<int> &nums)
    {
        if (nums.size() == 0)
        {
            return 0;
        }
        int p = 1, i;
        for (i = 1; i < nums.size(); i++)
        {
            if (nums[i] != nums[i - 1])
            {
                nums[p] = nums[i];
                p++;
            }
        }
        return p;
    }
};
