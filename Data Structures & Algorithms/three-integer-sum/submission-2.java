class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> trips = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int target = -1 * nums[i];
            int low = i + 1;
            int high = nums.length - 1;
            int sum = target - 1;

            while (low < high) {
                sum = nums[low] + nums[high];

                if (sum > target) {
                    high--;
                } else if (sum < target) {
                    low++;
                } else {
                    trips.add(List.of(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    while (low < high && nums[low] == nums[low - 1]) {
                        low++;
                    }
                }
            }
        }

        return trips;
    }
}
