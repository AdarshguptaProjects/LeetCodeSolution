class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0,j=0;
        int balancedLength=1;
        while(j<nums.length){
            long min=nums[i];
            long max=nums[j];
            while(i<j && max> min*k){
                i++;
                min=nums[i];
            }
            balancedLength= Math.max(balancedLength,j-i+1);
            j++;
        }
        return nums.length-balancedLength;
    }
}