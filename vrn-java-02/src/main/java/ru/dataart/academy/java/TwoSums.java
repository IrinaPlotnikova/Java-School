package ru.dataart.academy.java;

public class TwoSums {
    /**
     * @param nums   - sorted in ascending order array of integer values >=0
     * @param target - integer value >= 0
     * @return - array of two numbers from nums which sum equals to target
     * Example: nums = [1, 4, 6, 7, 10], target = 10
     * Result - [4, 6]
     * Example: nums = [1, 4, 6, 7, 10], target = 2
     * Result - []
     */
    public int[] getTwoSum(int[] nums, int target) {
        // асимптотика O(n * log(n))
        for (int i = 0; i < nums.length; i++){
            int rightBound = nums.length;
            int leftBound = i;

            while (rightBound - leftBound > 1) {
                int middle = (leftBound + rightBound) / 2;

                if (nums[i] + nums[middle] > target)
                    rightBound = middle;
                else
                    leftBound = middle;
            }
            // если x - [i, leftBound] : nums[i] + nums[leftBound] <= target
            // если x - [rightBound, ...] : nums[i] + nums[rightBound] > target

            if (leftBound > i && nums[i] + nums[leftBound] == target)
                return new int[]{nums[i], nums[leftBound]};
        }
        return new int[]{};
    }
}
