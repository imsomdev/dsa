class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> factor = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if((n%i) == 0){
                factor.add(i);
            }
        }
        if(factor.size() < k){
            return -1;
        }
        int result = factor.get(k-1);
        return result;
    }
}