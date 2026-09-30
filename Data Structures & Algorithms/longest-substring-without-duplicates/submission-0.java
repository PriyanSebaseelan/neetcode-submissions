class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int count = 0;
        int max = 0;
        HashSet<Character> seen = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
                count--;
            }

            seen.add(s.charAt(right));
            count++;
            if (count > max) {
                max = count;
            }
        }

        return max;
    }
}
