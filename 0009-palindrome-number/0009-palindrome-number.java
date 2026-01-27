class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x==0){
            return true;
        }
        int original = x;
        int sum = 0;
        while(x>0){
            int rem = x%10;
            x=x/10;
            sum= sum*10+rem;
        }
        if(sum==original){
            return true ;
        }
        else{
            return false ;
            
        }
    }
}