class Solution {
    public String destCity(List<List<String>> paths){
        HashMap<String,Integer> outd=new HashMap<>();
        for (int i=0;i<paths.size();i++) {
            String A=paths.get(i).get(0);
            outd.put(A,outd.getOrDefault(A,0)+1);
        }
        for (int i=0;i<paths.size();i++){
            String B =paths.get(i).get(1);
            if (!outd.containsKey(B)) {
                return B;
            }
        }
        return "";
    }
}