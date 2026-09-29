class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> new_map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (new_map.containsKey(sorted)) {
                new_map.get(sorted).add(strs[i]);
            } else {
                new_map.put(sorted, new ArrayList<>());
                new_map.get(sorted).add(strs[i]);
            }
        }
        return new ArrayList<>(new_map.values());
    }
}
