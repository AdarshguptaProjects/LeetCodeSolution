class Solution {
    public int bitwiseComplement(int n) {
    int bit = (int)Math.floor(Math.log(n)/Math.log(2))+1;
    int mask = (1<<bit)-1;
    return n^mask;
    }
}