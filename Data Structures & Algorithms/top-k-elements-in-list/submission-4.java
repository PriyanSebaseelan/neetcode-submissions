class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] copy = new List[nums.length + 1];        
        int[] ans =  new int[k];

        for (int x : nums) {
            if (map.containsKey(x)) {
                map.replace(x, map.get(x)+1);
            } else {
                map.put(x, 1);
            }
        }

        Integer[] keys = map.keySet().toArray(new Integer[0]);
        Integer[] vals = map.values().toArray(new Integer[0]);

        for (int i = 0; i < map.size(); i++) {
            if (copy[vals[i]] == null) {
                copy[vals[i]] = new ArrayList<>();
            }
            copy[vals[i]].add(keys[i]);
        }

        for (int j = copy.length-1; j > 0; j--) {
            if (copy[j] != null) {
                for (int w = 0; w < copy[j].size(); w++) {
                    ans[k-1] = copy[j].get(w);
                    k--;
                }

                if (k == 0) {
                    return ans;
                }
            }
            if (k == 0) {
                return ans;
            }
        }

        return ans;
    }
}
