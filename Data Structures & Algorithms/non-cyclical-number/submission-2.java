class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        while(n!=0){
            int last=n%10;
            int squ=last*last;
            n=n/10;
            sum=sum+squ;
        }
        if(sum==1){
            return true;
        }
        return false;
    }
}
