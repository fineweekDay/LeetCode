import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * title:Two Sum
 * description:Given an array of integers, return indices of the two numbers such that they add up to a specific target.
   You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Created by Administrator on 2017/11/14.
 */
public class Two_Sum {

    public int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement))
                return new int[]{map.get(complement),i};
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args){
        int[] nums={2,7,11,15,};
        int target=9;
        Two_Sum ex=new Two_Sum();
        System.out.println(Arrays.toString(ex.twoSum(nums,target)));
    }
}
