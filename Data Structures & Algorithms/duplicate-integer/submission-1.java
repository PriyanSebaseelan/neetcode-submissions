class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> copySet = new HashSet<Integer>();

        for (int x: nums) {
            copySet.add(x);
        }

        return copySet.size() != nums.length;
    }
}