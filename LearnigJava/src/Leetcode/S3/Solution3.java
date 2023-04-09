package Leetcode.S3;

public class Solution3 {
    public boolean isPalindrome(int x) {
        String X = Integer.toString(x);
        for(int i = 0; i < X.length()/2; i++){
            if(X.charAt(i) != X.charAt(X.length() - i- 1)){
                return false;
            }
        }
        return true;
    }
}
