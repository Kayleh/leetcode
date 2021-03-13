#include "iostream"
#include "vector"
#include "unordered_map"

using namespace std;

//输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2,2]
class Solution
{
public:
    vector<int> intersect(vector<int> &nums1, vector<int> &nums2)
    {
        if (nums1.size() > nums2.size())
        {
            return intersect(nums2, nums1);
        }
        unordered_map<int, int> unorderedMap;
        for (int num_1 : nums1)
        {
            ++unorderedMap[num_1];
        }
        vector<int> intersection;
        for (int num_2 : nums2)
        {
            if (unorderedMap.count(num_2))
            {
                intersection.push_back(num_2);
                --unorderedMap[num_2];
                if (unorderedMap[num_2] == 0)
                {
                    unorderedMap.erase(num_2);
                }
            }
        }
        return intersection;
    }
};

