import java.util.Arrays;

/**
 * @description:异位词通过字符排序，对比
 * @author: yaobw
 * @date: 2020/8/9 4:05 下午
 */
public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1,t1);
    }
}
