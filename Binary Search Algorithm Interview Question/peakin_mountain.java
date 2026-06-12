public class peakin_mountain {
    public static void main(String[] args) {
        int[] arr={0,1,3,5,7,6,4,2};
        System.out.println(bsearch(arr));
    }
    static int bsearch(int[] nums) {
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
}
