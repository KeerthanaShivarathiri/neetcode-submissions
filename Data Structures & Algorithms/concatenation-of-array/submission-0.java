class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=2*nums.length;
        int[] a=new int[n];
        System.arraycopy(nums,0,a,0,nums.length);
        System.arraycopy(nums,0,a,nums.length,nums.length);
        return a;
    }
}