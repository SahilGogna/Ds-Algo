package leetcodearrays;

public class Q137 {
    public int removeDuplicates(int[] nums) {
        int uniquePointer = 0;
        for(int loopPointer=0; loopPointer< nums.length; loopPointer++){
            if( nums[uniquePointer] != nums[loopPointer]){
                nums[++uniquePointer] = nums[loopPointer];
            }
        }
        return uniquePointer+1;
    }
}
