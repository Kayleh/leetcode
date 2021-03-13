#include <numeric>
#include "iostream"
#include "vector"

using namespace std;

class Solution
{
public:
    int findNumbers(vector<int> &nums)
    {
        int count = 0;
        int i;
        for (i = 0; i < nums.size(); ++i)
        {
            int num = nums[i];//100000
            int digit = 1;
            while (num >= 10)
            {
                num /= 10;
                digit++;
            }
            if (digit % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }
};

//class Solution1
//{
//public:
//    int findNumbers(vector<int> &nums)
//    {
//        return accumulate(nums.begin(), nums.end(), 0, [](int ans, int num)
//        {
//            return ans + (to_string(num).size() % 2 == 0);
//        });
//    }
//};


