class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();

        for(int i: nums1){
            set.add(i);
        }

        HashSet<Integer> common = new HashSet<>();

        for(int i: nums2){
            if(set.contains(i)){
                common.add(i);
            }
        }

        int[] ans = new int[common.size()];
        int index = 0;
        for(int i: common){
            ans[index] = i;
            index++;
        }
        return ans;
    }
}