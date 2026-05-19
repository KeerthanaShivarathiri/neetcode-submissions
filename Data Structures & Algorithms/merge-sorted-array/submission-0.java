class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] r=new int[m+n];
        for(int i=0;i<m;i++){
            r[i]=nums1[i];
        }
        int a=0;
        for(int i=m;i<r.length;i++){
            r[i]=nums2[a++];
            
        }
        Arrays.sort(r);
        for(int i=0;i<r.length;i++){
            nums1[i]=r[i];
        }
        
    }
}