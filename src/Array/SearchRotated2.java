package Array;

public class SearchRotated2 {
    public boolean solution(int[] nums, int target) {
        int first = 0;
        int last = nums.length -1;
        while(first <= last){
            int mid = (first+last)/2;
            if(nums[mid] == target)
                return true;
            if (nums[mid] < nums[last] || nums[mid] < nums[first]) {
                if (nums[mid] < target && target <= nums[last])
                    first = mid + 1;
                else
                    last = mid - 1;
            }else if(nums[first] < nums[mid] || nums[last] < nums[mid]){
                if(nums[first] <= target && target < nums[mid])
                    last = mid -1;
                else
                    first = mid + 1;
            }else
                last -- ;

        }
        return false;
    }
}
