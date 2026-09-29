class Solution {

    public String encode(List<String> strs) {
        String total = "";

        if (strs.equals(new ArrayList<>(Arrays.asList()))) {
            return "[]";
        } else if (strs.size() == 0) {
            return "/#";
        }

        for (int i = 0; i < strs.size(); i++) {
            total += strs.get(i) + "/#";
        }

        return total;
    }

    public List<String> decode(String str) {
        ArrayList<String> ans = new ArrayList<>();

        if ("/#".equals(str)) {
            return new ArrayList<>(Arrays.asList(""));
        } else if ("[]".equals(str)) {
            return new ArrayList<>(Arrays.asList());
        }

        String word = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == '/' && str.charAt(i+1) == '#') {
                ans.add(word);
                i++;
                word = "";
            } else {
                word += str.charAt(i)+"";
            }
        }

        return ans;
    }
}
