class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prods = new int[nums.length];
        int big_p = 1;
        boolean seen = false;
        int add_p = 0;

        for (int x : nums) {
            if (x != 0) {
                big_p *= x;
            } else {
                seen = true;
                add_p += 1;
            }
        }

        for (int i = 0 ; i < nums.length; i++) {
            if (seen) {
                if (nums[i] != 0 || add_p >= 2) {
                    prods[i] = 0;
                } else {
                    prods[i] = big_p;
                }
            } else {
                prods[i] = big_p / nums[i];
            }
        }

        return prods;
    }
}  
