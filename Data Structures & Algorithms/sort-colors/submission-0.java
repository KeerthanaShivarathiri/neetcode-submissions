class Solution {
    public void sortColors(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            int s=i;
            for(int j=i+1;j<n;j++){
                if(arr[s]>arr[j]){
                    s=j;
                }
            }
            int t=arr[s];
            arr[s]=arr[i];
            arr[i]=t;
        }
    }
}