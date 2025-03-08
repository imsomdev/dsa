class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int i = 0, j= k-1;
        int res = Integer.MAX_VALUE;
        char[] blocksArray = blocks.toCharArray();
        while(j<n){
            int wc = 0;
            for(int idx=i; idx<=j; idx++){
                if(blocksArray[idx]=='W') wc++;
            }
            System.out.print(wc);
            res = Math.min(res, wc);
            i++;
            j++;

        }
        return res;
    }
}