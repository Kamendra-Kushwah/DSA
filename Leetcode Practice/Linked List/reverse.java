class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop", row2 = "asdfghjkl", row3 = "zxcvbnm";
        Set<Character> set1 = new HashSet<>(), set2 = new HashSet<>(), set3 = new HashSet<>();
        for (char c : row1.toCharArray()) set1.add(c);
        for (char c : row2.toCharArray()) set2.add(c);
        for (char c : row3.toCharArray()) set3.add(c);

        List<String> res = new ArrayList<>();
        for (String w : words) {
            String lower = w.toLowerCase();
            Set<Character> target = set1.contains(lower.charAt(0)) ? set1 :
                                    set2.contains(lower.charAt(0)) ? set2 : set3;
            boolean ok = true;
            for (char c : lower.toCharArray()) {
                if (!target.contains(c)) {
                    ok = false;
                    break;
                }
            }
            if (ok) res.add(w);
        }
        return res.toArray(new String[0]);
    }
}
