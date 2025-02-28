class Solution {

    static boolean isPalindrome(String s){
        int n = s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        int max= Integer.MIN_VALUE;
        String res="";

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String m = s.substring(i,j+1);
                int k = m.length();
                if(isPalindrome(m)){
                    if(k>max){
                        max=k;
                        res=m;
                    }
                }
            }
        }
        return res;
    }
}