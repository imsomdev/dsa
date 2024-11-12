class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] item : items) {
            int price = item[0];
            int beauty = item[1];
            map.put(price, Math.max(map.getOrDefault(price, 0), beauty));
        }
        List<int[]> sortedPrices = new ArrayList<>();
        for (int price : map.keySet()) {
            sortedPrices.add(new int[]{price, map.get(price)});
        }
        Collections.sort(sortedPrices, Comparator.comparingInt(a -> a[0]));

        int maxBeauty = 0;
        for (int[] priceBeauty : sortedPrices) {
            maxBeauty = Math.max(maxBeauty, priceBeauty[1]);
            priceBeauty[1] = maxBeauty;
        }

        int n = queries.length;
        int[] answer = new int[n];
        int[][] sortedQueries = new int[n][2];
        for (int i = 0; i < n; i++) {
            sortedQueries[i][0] = queries[i];
            sortedQueries[i][1] = i;
        }
        Arrays.sort(sortedQueries, Comparator.comparingInt(a -> a[0]));

        for (int[] query : sortedQueries) {
            int queryPrice = query[0];
            int originalIndex = query[1];
            int pos = binarySearch(sortedPrices, queryPrice);
            if (pos >= 0) {
                answer[originalIndex] = sortedPrices.get(pos)[1];
            } else {
                answer[originalIndex] = 0;
            }
        }

        return answer;
    }

    private int binarySearch(List<int[]> sortedPrices, int queryPrice) {
        int left = 0, right = sortedPrices.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (sortedPrices.get(mid)[0] <= queryPrice) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
