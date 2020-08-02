/**
 * @description:
 * @author: yaobw
 * @date: 2020/8/2 9:21 下午
 */
public class RotateArry {

    public void rotate(int[] nums, int k) {
        for(int i = 0; i< k; i++){
            int lastNum = nums[nums.length-1];
            for(int j = 0 ; j < nums.length; j++){
                int temp = nums[j];
                nums[j] = lastNum;
                lastNum = temp;
            }
        }
    }
}
