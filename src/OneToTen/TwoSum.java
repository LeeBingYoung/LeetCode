package OneToTen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.print("["+twoSumHash(nums,target)[0]+", "+twoSumHash(nums,target)[1]+"]");
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = {-1,-1};
        for(int i = 0;i < nums.length - 1;i++){
            if(nums[i] <= target){
                for(int j = i+1;j<nums.length;j++){
                    if(nums[i] + nums[j] == target){
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
        }
        return result;
    }
    public static int[] twoSumHash(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] { map.get(complement),i };
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
