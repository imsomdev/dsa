class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int res = k, wc = 0;

        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') wc++;
        }

        res = wc;

        for (int i = k; i < n; i++) {
            if (blocks.charAt(i - k) == 'W') wc--;
            if (blocks.charAt(i) == 'W') wc++;

            res = Math.min(res, wc);
        }

        return res;
    }
}
