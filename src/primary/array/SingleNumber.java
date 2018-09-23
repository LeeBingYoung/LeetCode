package primary.array;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++) {
             a^=nums[i];
        }
        return a;
    }

}
