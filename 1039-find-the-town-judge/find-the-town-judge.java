class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] arr = new int[n];
        int townJudge = -1;
        for(int i=0; i < trust.length; i++){
            int value = trust[i][1] - 1;
            arr[value]++;
        }
        for(int i=0; i < arr.length; i++){
            if(arr[i]== n - 1){
                townJudge = i+1;
            }
        }
        for(int i=0; i < trust.length; i++){
            if(trust[i][0]==townJudge){
                return -1;
            }
        }
        return townJudge;
    }
}