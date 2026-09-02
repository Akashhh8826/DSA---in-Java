class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            int value = Math.abs(nums[i]);
            int position = value - 1;
            if(nums[position] > 0){
                nums[position] = -nums[position];
            }
            else{
                ans.add(value);
            }
        }
        return ans;
    }
}