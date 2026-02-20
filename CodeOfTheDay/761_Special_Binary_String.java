class Solution {
    public String makeLargestSpecial(String s) {
        ArrayList<String> al = new ArrayList<>();
        int sum=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            sum+=s.charAt(i)=='0'?-1:1;
            if(sum==0){
                String inner = s.substring(start+1,i);
                al.add("1"+makeLargestSpecial(inner)+"0");
                start=i+1;
            }
        }
        return al.stream().sorted(Comparator.reverseOrder()).reduce("",(a,b)->a+b);
    }
}
