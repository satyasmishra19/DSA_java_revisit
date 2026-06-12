public class RotationCount {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        System.out.println(countRotation(nums));
    }
    static int countRotation(int[] nums) {
        int pivot = findpivot(nums);
        return pivot+1;
    }
    //use for non duplicates
    static int findpivot(int[] nums) {
        int start= 0;
        int end=nums.length-1;

        while (start<=end) {
            int mid=start+((end-start)/2);

            //4 cases
            if (mid<end && nums[mid]>nums[mid+1]) {
                return mid;
            }
            else if (mid>start && nums[mid]<nums[mid-1]) {
                return mid-1;
            }
            else if (nums[mid]>=nums[start]) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    //use for duplicates
    static int findpivotwithduplicates(int[] nums) {
        int start= 0;
        int end=nums.length-1;

        while (start<=end) {
            int mid=start+((end-start)/2);

            //4 cases
            if (mid<end && nums[mid]>nums[mid+1]) {
                return mid;
            }
            else if (mid>start && nums[mid]<nums[mid-1]) {
                return mid-1;
            }
            //if the duplicates elements are start,end,middle
            //just skip it
            if (nums[start]==nums[mid] && nums[mid]==nums[end]) {
                //check if start is pivot
                if (nums[start]>nums[start+1]) {
                    return start;
                }
                start++;
                if (nums[end]<nums[end-1]) {
                    return end;
                }
                end--;
            }
            //left side is sorted, so pivot should be in right
            else if(nums[start]<nums[mid] || (nums[start] == nums[mid] && nums[mid]>nums[end])){
                start=mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
