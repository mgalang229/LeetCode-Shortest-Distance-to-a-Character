class Solution {
    public int[] shortestToChar(String s, char c) {
        char[] ss = s.toCharArray();
        int n = ss.length;
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        int nearest = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (ss[i] == c) {
                nearest = i;
            }
            dist[i] = Math.abs(i - nearest);
        }
        nearest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (ss[i] == c) {
                nearest = i;
            }
            dist[i] = Math.min(dist[i], Math.abs(i - nearest));
        }
        return dist;
    }
}
