 // Solution using HashMap
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int dif = target - nums[i];
            if (numMap.get(dif) != null) {
                return new int[] { i, numMap.get(dif) };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}
