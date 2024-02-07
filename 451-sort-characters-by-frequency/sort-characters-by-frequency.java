public class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        List<Character> charList = new ArrayList<>();
        for (char c = 0; c < 128; c++) {
            if (freq[c] > 0) {
                charList.add(c);
            }
        }
        charList.sort((a, b) -> Integer.compare(freq[b], freq[a]));
        StringBuilder sortedString = new StringBuilder();
        for (char c : charList) {
            for (int i = 0; i < freq[c]; i++) {
                sortedString.append(c);
            }
        }

        return sortedString.toString();
    }
}