class Solution {
    public int countPrimeSetBits(int left, int right) {
        int i=left;
        int res=0;
        while(i<=right){
            int checkBits = checkBitsCount(i);
            if(checkPrime(checkBits)){
                res++;
            }
            i++;
        }
        return res;
    }
    public int checkBitsCount(int n){
        int res=0;
        while(n>0){
            if((n&1)==1)
                res++;
            n=n>>1;
        }
        return res;
    }
    public boolean checkPrime(int n){
        if(n==1||n==0)
            return false;
        if(n==2)
            return true;
        for(int i=2;i*i<=n;i++){
            if((n%i)==0)
                return false;
        }
        return true;
    }
}
