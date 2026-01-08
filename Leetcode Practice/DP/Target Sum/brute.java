class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return ans(nums,0,0 , target);
    }
    static int  ans(int [] nums, int index, int currSum , int target){
        // base condition
        if(index== nums.length){
            return (currSum==target) ? 1:0; 
        }
        // add and substract 
        int p=ans(nums, index+1, currSum+nums[index],target);
        int n=ans(nums, index+1 , currSum-nums[index], target);
        return p+n;
    }
}
