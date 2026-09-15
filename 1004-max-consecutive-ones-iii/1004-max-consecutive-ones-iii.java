class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int zeroCount = 0;
        int maxCount = 0;

        for(int right = 0; right<n; right++){
            if(nums[right] == 0){
                zeroCount++;
            }

            if(zeroCount > k){
                if(nums[left] == 0){
                    zeroCount--;
                }
                left++;
            }

            if(zeroCount <= k){
                int len = right - left + 1;
                maxCount = Math.max(maxCount, len);
            }
        }
        return maxCount;
    }
}