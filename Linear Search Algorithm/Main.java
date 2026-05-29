public class Main {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8};
        int target= 10;
        System.out.println(linearSearch1(num, target));
    }

    //search in the array: return the index if item found
    //otherwise if item not found return -1

    static int linearSearch1(int[] arr, int target) {
        if (arr.length==0) {
            return -1;
        }

        // run for a loop
        for (int idx = 0; idx < arr.length; idx++) {
            //check every element at every index
            int element = arr[idx];
            if(element == target){
                return idx;
            }
        }
        //this line will execute if non of the return statement above have executed
        //hence not found
        return -1;
    }


    //searching the element and returning the element itself
    static int linearSearch2(int[] arr, int target) {
        if (arr.length==0) {
            return -1;
        }

        // run for a loop
        for (int element : arr) {
            if(element == target){
                return element;
            }
        }
        //this line will execute if non of the return statement above have executed
        //hence not found
        return Integer.MAX_VALUE;
    }

}
