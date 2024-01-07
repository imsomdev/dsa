import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int count = 0;

        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                st.push(asteroids[i]);
                count++;
            } else {
                while (count > 0 && Math.abs(asteroids[i]) > st.peek() && st.peek() > 0) {
                    st.pop();
                    count--;
                }
                if (count == 0 || st.peek() < 0) {
                    st.push(asteroids[i]);
                    count++;
                } else if (Math.abs(asteroids[i]) == st.peek()) {
                    st.pop();
                    count--;
                }
            }
        }

        int[] result = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;
    }
}
