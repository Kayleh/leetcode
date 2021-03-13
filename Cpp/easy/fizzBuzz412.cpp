#include "iostream"
#include "vector"

using namespace std;

//class Solution
//{
//public:
//    vector<string> fizzBuzz(int n)
//    {
//        vector<string> result;
//        for (int i = 1; i <= n; ++i)
//        {
//            string str;
//            if (i % 3 == 0)
//                str += "Fizz";
//            if (i % 5 == 0)
//                str += "Buzz";
//            if (i % 3 != 0 && i % 5 != 0)
//                str = to_string(i);
//            result.push_back(str);
//        }
//        return result;
//    }
//};

vector<string> fizzBuzz(int n) {
    vector<string> res;
    for(int i = 1;i <= n;++i){
        if(i%15 == 0) res.push_back("FizzBuzz");
        else if(i%3 == 0) res.push_back("Fizz");
        else if(i%5 == 0) res.push_back("Buzz");
        else res.push_back(to_string(i));
    }
    return res;
}
