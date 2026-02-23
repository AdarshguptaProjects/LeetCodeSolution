class Solution {
    public boolean hasAllCodes(String s, int k) {
        int count = (int)Math.pow(2,k);
        Set<String> set = new HashSet<>();
        for(int i=k;i<=s.length();i++){
            String temp = s.substring(i-k,i);
            if(!set.contains(temp)){
                set.add(temp);
                count--;
            }
            if(count==0){
                return true;
            }
        }
        return false;
    }
}
