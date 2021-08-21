package array.q10.q169.solution1;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = getNumMap(nums);
        int resValue = 0, res = 0;
//        Map.Entry<Integer, Integer> resEntry = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
//            res=res?value
            if (value > resValue) {
                resValue = value;
                res = entry.getKey();
//                resEntry=entry;
            }
        }
        return res;
//        return resEntry.getKey();

    }

    private Map<Integer, Integer> getNumMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
                continue;
            }
            map.put(num, 1);
        }

        return map;
    }


//    Map<Integer, Integer> counts = countNums(nums);
//
//    Map.Entry<Integer, Integer> majorityEntry = null;
//        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
//        if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
//            majorityEntry = entry;
//        }
//    }
//
//        return majorityEntry.getKey();


    private Map<Integer, Integer> countNums1(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            } else {
                counts.put(num, counts.get(num) + 1);
            }
        }
        return counts;
    }
}