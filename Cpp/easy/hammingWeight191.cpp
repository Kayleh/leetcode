#include "iostream"

using namespace std;

class Solution
{
public:
    int hammingWeight(uint32_t n)
    {
        int count = 0;
        while (n != 0)
        {
            count++;
            n = n & (n - 1);
            //在位运算中，& 表示“与”，也就是如果 0&1，会是0；1&0，会是0；0&0，会是0；1&1会是1。
            // 如果我们用1111&1110，会得到1110，这就消除了1111最右边的1，我们通过这种方法不断消除最右边的1，来判断一个数有几个1。
        }
        return count;
    }
};

