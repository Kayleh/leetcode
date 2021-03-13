#include "iostream"
#include "vector"

using namespace std;

//首先要知道第0天买入，第3天卖出的利润：prices[3] - prices[0]，相当于(prices[3] - prices[2]) + (prices[2] - prices[1]) + ()prices[1] - prices[0])
//那么根据prices可以得到每天的利润序列：(prices[i] - prices[i - 1]).....(prices[1] - prices[0])。
//可以发现，我们需要收集每天的正利润就可以，收集正利润的区间，就是股票买卖的区间，而我们只需要关注最终利润就可以了，不需要记录区间。

//这就是贪心所贪的地方，只收集正利润。

class Solution
{
public:
    int maxProfit(vector<int> &prices)
    {
        int max_profix = 0;
        int day = prices.size();
        for (int i = 1; i < day; ++i)
        {
            max_profix += max(0, prices[i] - prices[i - 1]);
        }
        return max_profix;
    }
};



