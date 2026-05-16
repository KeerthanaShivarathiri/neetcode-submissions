class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int a=0;
        int b=-1;
        for(Map.Entry<Integer,Integer> e:m.entrySet()){
            if(e.getValue()>a){
                a=e.getValue();
                b=e.getKey();
            }
        }
        return b;
        
    }
}