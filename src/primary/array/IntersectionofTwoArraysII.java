package primary.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int a : nums1) {
            if(map.containsKey(a)) map.put(a, map.get(a) + 1);
            else map.put(a, 1);
        }
        for(int a : nums2) {
            if(map.containsKey(a) && map.get(a) > 0) {
                map.put(a, map.get(a) - 1);
                result.add(a);
            }
        }
        int[] ans = new int[result.size()];
        for(int i = 0 ; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}
