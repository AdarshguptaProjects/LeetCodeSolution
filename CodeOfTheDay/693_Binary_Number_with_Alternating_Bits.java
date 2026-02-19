//If we do log(n) of a number it will give me the first set position from the left
// If we do the xor of alternating bits no it will give me a no whose all the bit are set and if if do the & of n&n+1 it will give me 0


class Solution {
    public boolean hasAlternatingBits(int n) {
        int currentBit=n&1;
        n=n>>1;
        while(n>0){
            if((n&1)==currentBit)
                return false;
            currentBit=n&1;
            n=n>>1;
        }
        return true;
    }
}

//Another approach for the same thing

class Solution {
    public boolean hasAlternatingBits(int n) {
        int res=n^(n>>1);
        return (res&(res+1))==0;
    }
}
