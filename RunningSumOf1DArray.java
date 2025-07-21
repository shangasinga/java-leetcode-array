class RunningSumOf1DArray {
    public int[] runningSum(int[] nums) {
        int runningSumArray[] = new int[nums.length];
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum+=nums[i];
            runningSumArray[i]=sum;
        }
        return runningSumArray;
    }
}