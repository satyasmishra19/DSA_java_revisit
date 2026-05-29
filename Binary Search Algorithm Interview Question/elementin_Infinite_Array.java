//KK way
public class elementin_Infinite_Array {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,7,8,10,11,12,13,25,27,30,31,32,33,34,35};
        int target=25;
        int index = find(arr, target);
        System.out.println(index);
    }

    static int find(int[] arr,int target) {
        int start=0;
        int end=1;
        while (target>arr[end]) {
            int newstart = start;
            start = end+1;
            end = end+(end-newstart+1)*2;
        }
        return bsearch(arr, target, start, end);
    }

    static int bsearch(int[] arr,int target,int start,int end){
        
        while (start<=end) {
            int mid=start+((end-start)/2);
            if (arr[mid]<target) {
                start=mid+1;
            }
            else if (arr[mid]>target) {
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}

//MY WAY

// public class elementin_Infinite_Array {
//     public static void main(String[] args) {
//         int[] arr = {2,3,5,6,7,8,10,11,12,13,25,27,30,31,32,33,34,35};
//         int[] ar2 = {0,2};
//         int target = 25;

//         int index = find(arr, ar2, target);
//         System.out.println(index);
//     }

//     static int find(int[] arr, int[] ar2, int target) {

//         int start = ar2[0];
//         int end = ar2[1];
//         int ssss = 0;

//         if ((arr[end]) >= target && target >= (arr[start])) {

//             ssss = bsearch(arr, target, start, end);

//         } else {

//             start = end;
//             ar2[0] = start;

//             end = end * 2;
//             ar2[1] = end;

//             return find(arr, ar2, target);
//         }

//         return ssss;
//     }

//     static int bsearch(int[] arr, int target, int start, int end) {

//         while (start <= end) {

//             int mid = start + ((end - start) / 2);

//             if (arr[mid] < target) {

//                 start = mid + 1;

//             } else if (arr[mid] > target) {

//                 end = mid - 1;

//             } else {

//                 return mid;
//             }
//         }

//         return -1;
//     }
// }
