class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            int value = Math.abs(nums[i]);
            int position = value - 1;
            if(nums[position] > 0){
                nums[position] = -nums[position];
            }
            else{
                return value;
            }
        }
    return -1;
    }
}