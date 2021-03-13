#include "iostream"
#include "vector"

using namespace std;

class Solution
{
public:
    int missingNumber(vector<int> &nums)
    {
        int n = nums.size() + 1;
        int res[n + 1];
        int i;
        for (i = 0; i < n; ++i)
            res[i] = i;
        for (i = 0; i < n - 1; ++i)
            res[nums[i]] ^= nums[i];
        for (i = 0; i < n; ++i)
            if (res[i] != 0)
                return i;
        return 0;
    }
};

//class Solution
//{
//public:
//    int missingNumber(vector<int> &nums)
//    {
//
//        int nums_size = nums.size();
//        int sum = nums_size;
//        for (int i = 0; i < nums_size; i++)
//        {
//            sum += i;
//            sum -= nums[i];
//        }
//        return sum;
//    }
//};

