public class SearchINMountain {
    public static void main(String[] args) {
        int[] arr={0,1,3,5,7,6,4,2};
        int target= 4;
        System.out.println(findInMountainArray(target,arr));
    }

    public static int findInMountainArray(int target, int[] arr) {
        int peak = peakINmountainArray(arr);
        int ans= ognbs(arr, target, 0, peak);
        if (ans!=-1) {
            return ans;
        }
        return ognbs(arr, target, peak+1, arr.length-1);
    }
    //https://leetcode.com/problems/find-in-mountain-array

    static int peakINmountainArray(int[] nums) {
        int start= 0;
        int end=nums.length-1;
        
        while (start<end) {
            int mid=start+((end-start)/2);
            if (nums[mid]<=nums[mid+1]) {
                //increasing part of an array
                start=mid+1;
            }
            else {
                //decreasing part of an array and may be the ans
                end=mid;
            }
        }
        return start;
    }

    static int ognbs(int[] arr, int target,int start,int end) {
        //find whether the array is sorted in ascending or descending. 
        boolean isasc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] == target) {
                return mid;
            }
            if (isasc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
