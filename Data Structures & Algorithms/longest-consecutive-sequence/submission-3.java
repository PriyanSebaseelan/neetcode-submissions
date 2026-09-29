class Solution {
    public int longestConsecutive(int[] nums) {
        ArrayList<Integer> nums_list = new ArrayList<>();

        if (nums.length < 2) {
            return nums.length;
        }

        Arrays.sort(nums);

        for (int x : nums) {
            nums_list.add(x);
        }

        int max = 1;
        int max_temp = 1;
        for (int i = 0; i < nums_list.size() - 1; i++) {
            if (nums_list.get(i+1) - nums_list.get(i) == 1) {
                max_temp += 1;
                if (max_temp > max) {
                    max = max_temp;
                }
            } else if (nums_list.get(i+1) - nums_list.get(i) == 0) {
                continue;
            } else {
                max_temp = 1;
            }
        }

        return max;
    }
}
