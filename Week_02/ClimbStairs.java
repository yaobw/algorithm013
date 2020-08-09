/**
 * @description:
 * @author: yaobw
 * @date: 2020/8/9 4:14 下午
 */
public class ClimbStairs {

    public int climbStairs(int n) {
        int[] cache = new int[n + 1];
        cache[0] = 1;
        cache[1] = 1;
        for(int i = 2; i <= n; i++){
            cache[i] = cache[i-1] + cache[i-2];
        }
        return cache[n];
    }
}
