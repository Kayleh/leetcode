#include "stdio.h"
#include "stdlib.h"

struct Index
{
    int key;
    int start;
} newIndex[3];

int search(int key, int a[]);

int cmp(const void *a, const void *b)
{
    return (*(struct Index *) a).key > (*(struct Index *) b).key ? 1 : -1;
}


int search(int key, int a[])
{
    int i, startValue;
    i = 0;
    while (i < 3 && key > newIndex[i].key)
        // 确定在哪个块中，遍历每个块，确定key在哪个块中
        i++;

    if (i >= 3)
        //大于分得的块数，则返回0
        return -1;

    startValue = newIndex[i].start; //startValue等于块范围的起始值
    while (startValue <= startValue + 5 && a[startValue] != key)
        startValue++;

    if (startValue > startValue + 5)
        //如果大于块范围的结束值，则说明没有要查找的数
        return -1;


    return startValue;
}

//int main()
//{
//    int i, j = -1, k, key;
//    int a[] = {33, 42, 44, 38, 24, 48, 22, 12, 13, 8, 9, 20, 60, 58, 74, 49, 86, 53};
//    for (i = 0; i < 3; ++i)
//    {
//        newIndex[i].start = j + 1;
//        j += 6;
//        for (int k = newIndex[i].start; k <= j; ++k)
//        {
//            if (newIndex[i].key < a[k])
//                newIndex[i].key = a[k];
//        }
//    }
//    qsort(newIndex, 3, sizeof(newIndex[0]), cmp);
//    printf("请输入您想要查找的数：\n");
//    scanf("%d", &key);
//    k = search(key, a);
//    //输出查找的结果
//    if (k > 0)
//        printf("查找成功！您要找的数在数组中的位置是：%d\n", k + 1);
//    else
//        printf("查找失败！您要找的数不在数组中。\n");
//
//    return 0;
//
//}
