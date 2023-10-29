class Solution {

    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> st = new HashSet<>();
        int ans = 0;

        for (char ch : jewels.toCharArray()) {
            st.add(ch);
        }

        for (char ch : stones.toCharArray()) {
            if (st.contains(ch)) {
                ans++;
            }
        }

        return ans;
    }
}
