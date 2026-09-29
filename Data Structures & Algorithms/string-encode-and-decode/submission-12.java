class Solution {

    public String encode(List<String> strs) {
        StringBuilder total = new StringBuilder();

        for (String s : strs) {
            total.append(s).append("/#");
        }

        return total.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> ans = new ArrayList<>();

        if ("/#".equals(str)) {
            return new ArrayList<>(Arrays.asList(""));
        } else if ("[]".equals(str)) {
            return new ArrayList<>(Arrays.asList());
        }

        StringBuilder word = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == '/' && str.charAt(i+1) == '#') {
                ans.add(word.toString());
                i++;
                word = new StringBuilder();
            } else {
                word.append(str.charAt(i)+"");
            }
        }

        return ans;
    }
}
