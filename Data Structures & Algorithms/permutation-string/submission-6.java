class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }

        char[] s1_array = s1.toCharArray();
        Arrays.sort(s1_array);

        for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
            char[] sub_array = (s2.substring(i, i+s1.length()).toCharArray());

            Arrays.sort(sub_array);

            if (Arrays.compare(sub_array, s1_array) == 0) {
                return true;
            }
        }

        return false;
    }
}
