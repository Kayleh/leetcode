////
//// Created by Kayleh on 2020/12/18.
////
//#include "iostream"
//
//using namespace std;
//
//void select_sort(int a[], int n)
//{
//    int min;
//    for (int i = 0; i < n - 1; ++i)
//    {
//        min = i;
//        for (int j = i + 1; j < n; ++j)
//        {
//            if (a[min] > a[j])
//            {
//                min = j;
//            }
//            swap(a[min], a[i]);
//        }
//    }
//}
//
//int main()
//{
//    int a[] = {1, 6, 3, 9, 2, 1, 0};
//    select_sort(a, 7);
//    for (int i = 0; i < 7; ++i)
//    {
//        cout << a[i] << endl;
//    }
//}
