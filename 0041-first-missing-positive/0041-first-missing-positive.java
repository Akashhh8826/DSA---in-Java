class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int n = nums.length;
        // 1. clean the array
        for(int i=0; i<n; i++){
            if(nums[i] < 1 || nums[i] > n){
                nums[i] = n + 1;
            }
        }

        // 2. mark indices
        for(int i=0; i<n; i++){
            int value = Math.abs(nums[i]);
            int position = value - 1;

            if(value > n) continue;

            if(nums[position] > 0){
                nums[position] = -nums[position];
            }
        }

        // 3. find unmarked index
        for(int i=0; i<n; i++){
            if(nums[i] > 0){
                return i+1;
            }
        }
        return n+1;
    }
}