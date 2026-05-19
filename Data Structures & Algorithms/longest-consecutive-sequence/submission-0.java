class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> r=new HashSet<>();
        for(int i:nums){
            r.add(i);
        }
        int b=0;
        for(int i:r){
            if(!r.contains(i-1)){
                int c=i;
                int m=1;
                while(r.contains(c+1)){
                    c++;
                    m++;
                }
                b=Math.max(b,m);

            }
            
        }
        return b;
    }
}
