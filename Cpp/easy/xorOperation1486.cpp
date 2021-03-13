#include "iostream"

using namespace std;

class Solution
{
public:
    int xorOperation(int n, int start)
    {
        int result = 0, i;
        for (i = 0; i < n; ++i)
            result  ^= start + 2 * i;
        return result;
    }
};
