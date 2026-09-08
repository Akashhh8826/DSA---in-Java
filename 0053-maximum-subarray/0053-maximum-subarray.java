class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){

            // find current sum
            currSum += nums[i];

            // compute maximum sum
            maxSum = Math.max(maxSum, currSum);
            
            // set sum = 0 if sum if negative
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
}