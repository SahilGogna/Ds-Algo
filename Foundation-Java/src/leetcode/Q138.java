package leetcode;

import java.util.Stack;

/**
 * @author sahilgogna on 2020-09-15
 */
public class Q138 {

    public static void main(String[] args) {
        int[] arr = {1,3};
        System.out.println(searchInsert(arr,2));
    }

    public static int searchInsert(int[] nums, int target) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else {
                if (stack.size() == 0) {
                    if (nums[i] > target) {
                        return i;
                    } else {
                        stack.push(nums[i]);
                    }
                } else {
                    if (i == nums.length - 1) {
                        int lower = stack.peek();
                        if (lower < target && target < nums[i]) {
                            return i;
                        } else {
                            return i + 1;
                        }
                    } else {
                        int lower = stack.peek();
                        if (lower < target && target < nums[i]) {
                            return i;
                        }
                        stack.push(nums[i]);
                    }
                }
            }
        }
        return 1;
    }
}
