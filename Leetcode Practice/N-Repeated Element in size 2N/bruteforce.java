/*
Problem Restatement
Array length = 2*𝑛
Contains :𝑛+1
unique elements : Exactly one element is repeated 𝑛 times
Task: Find that repeated element. */

// Brute force : Sort + neighbour  TC: O(nlogn) 
class Solution {
    public int repeatedNTimes(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                ans=nums[i];
            }
        }
        return ans;
    }
}
// Hashset : check in container repeated element is present or not
class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> seen = new HashSet<>(); 
        for (int num : nums) { 
          if (seen.contains(num)) {
               return num;
          }
          seen.add(num); 
        } 
      return -1; // never reached
    }
}
// neighbours but fails on that problems
class Solution {
    public int repeatedNTimes(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i+1] || nums[i] == nums[i+2]) return nums[i];
        }
        return nums[0];
    }
}
