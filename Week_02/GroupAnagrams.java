import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 分组通过hash解决
 * @author: yaobw
 * @date: 2020/8/9 4:09 下午
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(int i = 0; i < strs.length; i++){
            char[] strArray = strs[i].toCharArray();
            Arrays.sort(strArray);
            String str = new String(strArray);
            if(map.containsKey(str)){
                map.get(str).add(strs[i]);
            } else{
                List<String> list = new ArrayList<String>();
                list.add(strs[i]);
                map.put(str, list);
            }

        }
        return new ArrayList(map.values());
    }
}
