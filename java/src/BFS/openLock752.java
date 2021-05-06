package BFS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Kayleh
 * @Date: 2021/4/8 1:28
 */
public class openLock752
{
    //双向BFS(必须要知道起点和终点)
    public int openLock(String[] deadends, String target)
    {
        Set<String> deads = new HashSet<>(Arrays.asList(deadends));
        //用集合不用队列，可以快速判断元素是否存在
        Set<String> q1 = new HashSet<>();
        Set<String> q2 = new HashSet<>();
        Set<String> visited = new HashSet<>();
        //初始化起点和终点
        q1.add("0000");
        q2.add(target);
        int step = 0;
        while (!q1.isEmpty() && !q2.isEmpty())
        {
            //在遍历的时候不能修改哈希集合
            //用temp存储q1的扩散结果
            Set<String> temp = new HashSet<>();

            //将q1的所有节点向周围扩散
            for (String cur : q1)
            {
                if (deads.contains(cur)) continue;
                if (q2.contains(cur)) return step;
                visited.add(cur);
                //将一个节点的未遍历相邻节点加入队列
                for (int j = 0; j < 4; j++)
                {
                    String up = plusOne(cur, j);
                    if (!visited.contains(up))
                        temp.add(up);

                    String down = minusOne(cur, j);
                    if (!visited.contains(down))
                        temp.add(down);
                }
            }
            step++;
            q1 = q2;
            q2 = temp;
        }
        return -1;
    }
//    public int openLock(String[] deadends, String target)
//    {
//        //记录需要跳过的死亡代码
//        Set<String> deads = new HashSet<>();
//        deads.addAll(Arrays.asList(deadends));
//        //记录已经穷举过的密码，防止走回头路
//        Set<String> visited = new HashSet<>();
//        Queue<String> q = new LinkedList<>();
//        //从起点开始启动广度优先搜索
//        int step = 0;
//        q.offer("0000");
//        visited.add("0000");
//        while (!q.isEmpty())
//        {
//            int round = q.size();
//            //将当前队列中的所有节点向周围扩散
//            for (int i = 0; i < round; i++)
//            {
//                String cur = q.poll();
//                if (deads.contains(cur)) continue;
//                if (cur.equals(target)) return step;
//
//                //将一个节点的未遍历相邻节点加入队列
//                for (int j = 0; j < 4; j++)
//                {
//                    String up = plusOne(cur, j);
//                    if (!visited.contains(up))
//                    {
//                        q.offer(up);
//                        visited.add(up);
//                    }
//                    String down = minusOne(cur, j);
//                    if (!visited.contains(down))
//                    {
//                        q.offer(down);
//                        visited.add(down);
//                    }
//                }
//
//            }
//            step++;
//        }
//
//        return -1;
//    }

    //将s[i]向下拨动一次
    private String minusOne(String s, int j)
    {
        char[] chars = s.toCharArray();
        if (chars[j] == '0')
            chars[j] = '9';
        else
            chars[j] -= 1;
        return new String(chars);
    }

    private String plusOne(String s, int j)
    {
        char[] chars = s.toCharArray();
        if (chars[j] == '9')
            chars[j] = '0';
        else
            chars[j] += 1;
        return new String(chars);
    }
}
