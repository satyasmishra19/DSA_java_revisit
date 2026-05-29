
public class oderagnosticBS {

    public static void main(String[] args) {
        //int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45,89};
        //int[] arr = {99,89,75,22,11,10,5,2,-4};
        int[] arr = {89};
        int target = 89;
        int ans = ognbs(arr, target);
        System.out.println(ans);
    }

    static int ognbs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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
