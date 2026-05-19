class Solution {
    public void reverseString(char[] s) {
        int n=s.length-1;
        for(int i=0;i<s.length/2;i++){
            char t=s[i];
            s[i]=s[n];
            s[n]=t;
            n--;
        }
    }
}