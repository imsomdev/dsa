class Solution {
    private Map<Integer, Integer> memo = new HashMap<>();
    
    public int tribonacci(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        
        int result;
        if (n == 0) {
            result = 0;
        } else if (n == 1 || n == 2) {
            result = 1;
        } else {
            result = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        }
        
        memo.put(n, result);
        return result;
    }
}