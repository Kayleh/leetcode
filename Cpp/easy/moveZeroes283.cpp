#include "iostream"
#include "vector"

using namespace std;

class Solution
{
public:
    void moveZeroes(vector<int> &nums)
    {
        int i, j;
        int k = nums.size();
        int count = 0;
        for (i = 0, j = 0; i < k; i++)
            nums[i] == 0 ? count++ : nums[j++] = nums[i];
        for (i = 0; i < count; i++)
            nums[j++] = 0;
    }
};


