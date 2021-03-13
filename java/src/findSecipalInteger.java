class Solution
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2};
        System.out.print(findSecipalInteger(arr));

    }

    /**
     * 给你一个非递减的 有序 整数数组，已知这个数组中恰好有一个整数，它的出现次数超过数组元素总数的 25%。
     * <p>
     * 请你找到并返回这个整数
     *
     * @param arr
     * @return
     */
    public static int findSecipalInteger(int[] arr)
    {
        // 数据长度的百分之25
        int threshold = arr.length / 4;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i + threshold] == arr[i])
            {
                return arr[i];
            }
        }
        return -1;

    }
}