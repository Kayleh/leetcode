//
// Created by Kayleh on 2020/12/18.
//
#include "iostream"

using namespace std;

void qucik_sort(int a[], int low, int high)
{
    int left, right, pivot;
    left = low;
    right = high;
    if (low < high)
    {
        pivot = a[low];    //最低的 设置为 枢轴
        while (left != right)
        {
            while (right > left && a[right] >= pivot)
            {
                --right;
            }
            if (left < right)
            {
                a[left] = a[right];
                ++left;
            }

            while (left < right && a[left] < pivot)
            {
                qucik_sort(a, low, left - 1);
                qucik_sort(a, left + 1, high);     ++left;
            }
            if (left < right)
            {
                a[right] = a[left];
                --right;
            }
        }
        a[left] = pivot;

    }
}
