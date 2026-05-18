class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<nums.length;i++){
            int s=0;
            for(int j=i;j<n;j++){
                s+=nums[j];
                if(s==k){
                    c++;
                }
            }
            
        }
        return c;
    }
}