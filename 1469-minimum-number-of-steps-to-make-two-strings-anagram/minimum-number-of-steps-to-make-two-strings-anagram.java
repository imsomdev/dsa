class Solution {
    public int minSteps(String s, String t) {

        HashMap<Character, Integer> charFrequency = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charFrequency.put(s.charAt(i), charFrequency.getOrDefault(s.charAt(i), 0) + 1);
            charFrequency.put(t.charAt(i), charFrequency.getOrDefault(t.charAt(i), 0) - 1);
        }
        int steps = 0;
        for (int freq : charFrequency.values()) {
            steps += Math.abs(freq);
        }
        return steps / 2;
    }
}
