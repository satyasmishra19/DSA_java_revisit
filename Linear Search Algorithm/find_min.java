public class find_min {
   public static void main(String[] args) {
    int[] arr = {18,12,-7,3,14,28};
    System.out.println(min1(arr));
   } 
   //this code for normal for loop
   static int min1(int[] arr) {
       if (arr.length==0) {
        return -1;
       }
       int minnum = Integer.MAX_VALUE;
       for(int i=0;i<arr.length;i++) {
           if (arr[i]<minnum) {
            minnum=arr[i];
           }
       }
       return minnum;
   }

   //this code for for(int i: each)
   static int min2(int[] arr) {
       if (arr.length==0) {
        return -1;
       }
       int minnum = Integer.MAX_VALUE;
       for (int i : arr) {
           if (i<minnum) {
            minnum=i;
           }
       }
       return minnum;
   }
}
