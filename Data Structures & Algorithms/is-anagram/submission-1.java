class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sSet = new HashMap<>();
        HashMap<Character, Integer> tSet = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (char x: s.toCharArray()) {
            if (sSet.containsKey(x)) {
                sSet.replace(x, sSet.get(x) + 1);
            } else {
                sSet.put(x, 0);
            }
        }

        for (char y: t.toCharArray()) {
            if (tSet.containsKey(y)) {
                tSet.replace(y, tSet.get(y) + 1);
            } else {
                tSet.put(y, 0);
            }
        }

        return sSet.equals(tSet);
    }
}
