#include "iostream"
#include "vector"

using namespace std;

//输入：[1,2,3,1]
//输出：4
//解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
//偷窃到的最高金额 = 1 + 3 = 4 。

//偷窃第 k 间房屋，那么就不能偷窃第 k-1 间房屋，偷窃总金额为前 k-2 间房屋的最高总金额与第 k 间房屋的金额之和。
//
//不偷窃第 k 间房屋，偷窃总金额为前 k-1 间房屋的最高总金额。

class Solution
{
public:
    int rob(vector<int> &nums)
    {
        if (nums.empty())return 0;
        int size = nums.size();
        if (size == 1)return nums[0];

        vector<int> dp = vector<int>(size, 0);

        dp[0] = nums[0];
        dp[1] = max(nums[0], nums[1]);
        for (int i = 2; i < size; i++)
        {
            dp[i] = max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[size - 1];
    }
};

