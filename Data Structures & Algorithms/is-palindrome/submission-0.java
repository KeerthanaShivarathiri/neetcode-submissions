class Solution {
    public boolean isPalindrome(String s) {
        String c = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        StringBuilder r=new StringBuilder();
        int n=c.length();
        
        for(int i=n-1;i>=0;i--){
            r.append(c.charAt(i));
        }
        String a=r.toString();
        if(a.equals(c)){
            return true;
        }
        return false;
    }
}
