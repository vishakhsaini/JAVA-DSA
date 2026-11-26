class Solution {
    public List<Integer> findSmallestSetOfVertices(
        int n, List<List<Integer>> edges) {
        ArrayList<Integer> indegree = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            indegree.add(0);
        }
        for (int i = 0; i < edges.size(); i++) {
            int to = edges.get(i).get(1);
            indegree.set(to, indegree.get(to) + 1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (indegree.get(i) == 0) {
                ans.add(i);
            }
        }
        return ans;
    }
}
