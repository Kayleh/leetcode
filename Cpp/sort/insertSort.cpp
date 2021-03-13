//
// Created by Kayleh on 2020/12/18.
//
#include<iostream>

using namespace std;

void insert_sort(int a[], int n)
{
    int i, j;
    for (i = 1; i < n; i++)
    { //循环从第2个元素开始
        if (a[i] < a[i - 1])
        {
            int temp = a[i];
            for (j = i - 1; j >= 0 && a[j] > temp; j--)
            {
                a[j + 1] = a[j];
            }
            a[j + 1] = temp;//此处就是a[j+1]=temp;
        }
    }
}

//int main()
//{
//    int a[] = {1, 6, 3, 9, 2, 1, 0};
//    select_sort(a, 7);
//    for (int i = 0; i < 7; ++i)
//    {
//        cout << a[i] << endl;
//    }
//}

