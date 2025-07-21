class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int i = 0, left = 0, right = n;
        int[] ans = new int[nums.length];
        while(left <= n-1){
            ans[i] = nums[left];
            ans[i+1] = nums[right];
            left++;
            right++;
            i+=2;
        }
        return ans;
    }
}