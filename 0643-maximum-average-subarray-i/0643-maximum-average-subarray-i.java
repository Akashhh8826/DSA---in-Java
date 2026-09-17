class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double sum = 0;
        double maxAvg = Integer.MIN_VALUE;
        double avg = 0;

        for(int i=0; i<k; i++){
            sum += nums[i];
        }

        avg = sum / k;

        maxAvg = Math.max(maxAvg, avg);

        for(int i=k; i<n; i++){
            sum += nums[i];
            sum -= nums[i-k];

            avg = sum / k;

            maxAvg = Math.max(maxAvg, avg);
        }
        return maxAvg;
    }
}