// The above is a brute force approach with the below performance
// Time complexity: O(n);
// Space Complexity: O(n);

/* class RunningSumOf1DArray {
    public int[] runningSum(int[] nums) {
        int runningSumArray[] = new int[nums.length];
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum+=nums[i];
            runningSumArray[i]=sum;
        }
        return runningSumArray;
    }
} */

// The above is a brute force approach with the below performance
// Time complexity: O(n);
// Space Complexity: O(1);

class RunningSumOf1DArray{
    public int[] runningSum(int[] nums){
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}