class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> r=new ArrayList<>();
        int n=nums.length;
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i:nums){
            a.put(i,a.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:a.entrySet()){
            if(e.getValue()>n/3){
                r.add(e.getKey());
            }
        }
        return r;
    }
}