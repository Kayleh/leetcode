#include "iostream"

using namespace std;

//比如5层楼梯可以从第四层一步跳上来，从第3层跳两步上来。
// 所以第n层楼梯跳的跳法为f(n)=f(n-1)+f(n-2)。
//根据这个思路，假设我要跳3阶楼梯，只要把最后跳1阶即（前面跳2阶楼梯的方法数）加上最后跳2阶（前面跳1阶楼梯的方法数）不就可以了吗？
//
//即跳n阶楼梯的方法数=跳n-1阶楼梯的方法数+跳n-2阶楼梯的方法数
//

class Solution
{
public:
    int climbStairs(int n)
    {
        if (n == 1 || n == 2) return n;
        int count, step1 = 1, step2 = 2;
        for (int i = 3; i <= n; i++)
        {
            count = step1 + step2;
            step1 = step2;
            step2 = count;
        }
        return count;
    }
};

