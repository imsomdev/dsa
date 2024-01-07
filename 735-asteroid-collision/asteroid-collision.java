class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                st.push(asteroids[i]);
            } else {
                while (!st.isEmpty() && Math.abs(asteroids[i]) > st.peek() && st.peek() > 0) {
                    st.pop();
                }
                if (st.isEmpty() || st.peek() < 0) {
                    st.push(asteroids[i]);
                } else if (Math.abs(asteroids[i]) == st.peek()) {
                    st.pop();
                }
            }
        }

        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }

        return res;
    }
}
