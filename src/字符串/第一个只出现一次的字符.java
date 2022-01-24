package 字符串;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author Hua
 * @Date: 2021/10/12 19:47
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 * 输入：s = "abaccdeff"
 * 输出：'b'
 */
public class 第一个只出现一次的字符 {
    //哈希表
    public static char firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Boolean> map = new HashMap<>();
        for (char c : chars) {
            map.put(c,(map.containsKey(c)));
        }
        for (char c : chars) {
            if (!map.get(c)) {
                return c;
            }
        }
        return ' ';
    }
    //有序哈希表
    public static char firstUniqChar2(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Boolean> map = new LinkedHashMap<>();
        for (char c : chars) {
            map.put(c, map.containsKey(c));
        }
        for (Map.Entry<Character, Boolean> characterBooleanEntry : map.entrySet()) {
            if (!characterBooleanEntry.getValue())return characterBooleanEntry.getKey();
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar2("abaccdeff"));
    }
}
