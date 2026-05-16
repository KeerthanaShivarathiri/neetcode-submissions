class Solution {
    public String longestCommonPrefix(String[] str) {
        StringBuilder s=new StringBuilder();
        Arrays.sort(str);
        char[] a=str[0].toCharArray();
        char[] b=str[str.length-1].toCharArray();
        for(int i=0;i<str[0].length();i++){
            if(a[i]!=b[i]){
                break;
            }
            s.append(a[i]);
        }
        return s.toString();
    }
}