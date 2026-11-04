class Solution {
    public int minCost(int n, int[] cuts) {
        int v = cuts.length;
        cuts = Arrays.copyOf(cuts, v + 2);
        cuts[v] = n;
        cuts[v + 1] = 0;
        Arrays.sort(cuts);
        int s = cuts.length;
        int[][] dp = new int[s][s];
        for(int gap=2;gap<s;gap++){
            for(int i=0;i+gap<s;i++){
                int j = i+gap;
                int res = Integer.MAX_VALUE;
                for(int k=i+1;k<j;k++){
                    int cost = dp[i][k]+dp[k][j]+cuts[j]-cuts[i];
                    res = Math.min(res,cost);
                }
                dp[i][j]=res;
            }
        }
        return dp[0][s-1];
    }
}