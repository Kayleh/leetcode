#include "iostream"

using namespace std;

class Solution
{
public:
    int getValue(char ch)
    {
        switch (ch)
        {
            case 'I':
                number = 1;
                break;
            case 'V':
                number = 5;
                break;
            case 'X':
                number = 10;
                break;
            case 'L':
                number = 50;
                break;
            case 'C':
                number = 100;
                break;
            case 'D':
                number = 500;
                break;
            case 'M':
                number = 1000;
                break;
            default:
                cout << "error!" << endl;
        }
        return number;
    }

    int romanToInt(string s)
    {
        int i;
        for (i = 0; i < s.size(); ++i)
        {
            int temp = getValue(s[i]);// temp=10
            if (i != 0 && temp > getValue(s[i - 1]))//10>1
            {
                temp = temp - getValue(s[i - 1]);//temp=10-1=9
                result = result - getValue(s[i - 1]) + temp;
                continue;
            }
            result += temp;
        }
        return result;
    }

private:
    int number;
//    int temp;
    int result;
};




//class Solution {
//public:
//    int romanToInt(string s) {
//        unordered_map<string, int> m = {{"I", 1}, {"IV", 3}, {"IX", 8}, {"V", 5}, {"X", 10}, {"XL", 30}, {"XC", 80}, {"L", 50}, {"C", 100}, {"CD", 300}, {"CM", 800}, {"D", 500}, {"M", 1000}};
//        int r = m[s.substr(0, 1)];
//        for(int i=1; i<s.size(); ++i){
//            string two = s.substr(i-1, 2);
//            string one = s.substr(i, 1);
//            r += m[two] ? m[two] : m[one];
//        }
//        return r;
//    }
//};
//
//作者：QQqun902025048
//        链接：https://leetcode-cn.com/problems/roman-to-integer/solution/2-xing-python-on-by-knifezhu/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。