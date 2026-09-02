class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2];

        for(int i=0; i<n; i++){
            int value = Math.abs(nums[i]);
            int position = value - 1 ;
            if(nums[position] > 0){
                nums[position] = -nums[position];
            }
            else{
                ans[0] = value;
                continue;
            }
        }

        for(int i=0; i<n; i++){
            if(nums[i] > 0){
                ans[1] = i+1;
            }
        }
        return ans;
    }
}