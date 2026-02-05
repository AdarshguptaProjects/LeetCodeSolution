class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                int tempIdx = (nums[i])%(n);
                if(i+tempIdx>=n){
                    tempIdx=i+tempIdx-n;
                    res[i]=nums[tempIdx];
                }
                else
                    res[i]=nums[i+tempIdx];
                
            }
            else if(nums[i]<0){
                int tempIdx = Math.abs(nums[i])%n;
                if(tempIdx-i>0){
                    tempIdx=n-(tempIdx-i);
                    res[i]=nums[tempIdx];
                }
                else
                    res[i]=nums[i-tempIdx];
            }
            else if(nums[i]==0)
                res[i] = nums[i];
        }
        return res;
    }
}