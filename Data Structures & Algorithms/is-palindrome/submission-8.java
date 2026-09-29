class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder build = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                build.append(Character.toLowerCase(ch));
            } else {
                continue;
            }
        }

        String palin = build.toString();
        if (palin.length() < 2) {
            return true;
        }

        int low = 0; 
        int high = palin.length() - 1;
        for (int i = 0; i <= palin.length() / 2; i++) {
            if (palin.charAt(low) == palin.charAt(high)) {
                low++;
                high--;
            } else {
                return false;
            }
        }

        return true;
    }
}
