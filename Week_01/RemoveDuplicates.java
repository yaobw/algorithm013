/**
 * @description:
 * @author: yaobw
 * @date: 2020/8/2 9:22 下午
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int pointer = 0;
        for(int i = 1; i<nums.length; i++){
            if(nums[pointer] != nums[i]){
                pointer++;
                nums[pointer] = nums[i];
            }
        }
        return pointer +1;
    }
}
