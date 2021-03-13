#include "iostream"
#include "vector"

using namespace std;


class Solution
{
public:
    int maxProfit(vector<int> &prices)
    {
        //遍历一遍数组，计算每次 到当天为止 的最小股票价格和最大利润。
        //输入: [7,1,5,3,6,4]      7,5,3,1,6,4
        //输出: 5
        int inf = 1e9;
        int minprice = inf, maxprofit = 0;
        for (int price: prices)
        {
            maxprofit = max(maxprofit, price - minprice);
            minprice = min(price, minprice);
        }
        return maxprofit;
    }
};
//
////动态规划
//class Solution {
//public:
//    int maxProfit(vector<int>& prices) {
//        int n = prices.size();
//        if (n == 0) return 0; // 边界条件
//        int minprice = prices[0];
//        vector<int> dp (n, 0);
//
//        for (int i = 1; i < n; i++){
//            minprice = min(minprice, prices[i]);//前几天的最低价格
//            dp[i] = max(dp[i - 1], prices[i] - minprice);//前几天的最高利益
//        }
//        return dp[n - 1];
//    }
//};


