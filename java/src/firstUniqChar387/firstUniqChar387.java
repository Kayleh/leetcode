package firstUniqChar387;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Kayleh
 * @Date: 2021/5/8 9:09
 */
public class firstUniqChar387
{
    public int firstUniqChar(String s)
    {
        char[] chars = s.toCharArray();
        int i;
        Map<Character, Integer> hashmap = new HashMap<>();
        for (i = 0; i < chars.length; i++)
            hashmap.put(chars[i], hashmap.getOrDefault(chars[i], 0) + 1);
//            if (hashmap.containsKey(chars[i]))
//            {
//                int value = hashmap.get(i);
//                hashmap.put(chars[i], value + 1);
//                continue;
//            }
//            hashmap.put(chars[i], count);

        for (i = 0; i < s.length(); i++)
            if (hashmap.get(chars[i]) == 1)
                return i;
        return -1;
    }

}
