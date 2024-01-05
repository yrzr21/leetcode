import java.util.HashMap;
import java.util.Map;

class twoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> match = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (match.containsKey(target - nums[i])) {
                return new int[]{match.get(target - nums[i]), i};
            }
            match.put(nums[i], i);
        }
        return null;
    }
}