class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] r=new int[m+n];
        for(int i=0;i<m;i++){
            r[i]=nums1[i];
        }
        int j=0;
        for(int i=m;i<r.length;i++){
            r[i]=nums2[j];
            j++;
        }
        Arrays.sort(r);
        double d=0;
        if(r.length%2!=0){
            d= r[r.length/2];
            return d;
        }
        d=(r[r.length/2]+r[(r.length/2)-1])/2.0;
        return d;

    }
}
