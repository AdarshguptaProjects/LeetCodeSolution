class Solution {
    public int longestBalanced(String s) {
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            int arr[] = new int[26];
            for(int j=i;j<s.length();j++){
                char c = s.charAt(j);
                arr[c-'a']++;
                
                if(checkBalanced(arr)){
                    maxLength=Math.max(maxLength,j-i+1);
                }
            }
        }
        return maxLength;
    }
    public boolean checkBalanced(int arr[]){
        int counter=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                continue;
            if(counter==0){
                counter=arr[i];
            }
            else if(arr[i]!=counter)
                return false;
        }
        return true;

    }
}
