
import java.util.Arrays;

public class search_in_range {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = -7;
        System.out.println(linearsearch1(arr,target,1,5));
    }

    //this is for this type of for loop
    static boolean  linearsearch1(int[] arr,int tgt,int start,int end) {
        if (arr.length==0) {
            return false;
        }
        for (int i=start;i<end;i++) {
            if (tgt==arr[i]) {
                return true;
            }
        }
        return false;
    }



    //this is code for this type of for loop for( char i : each)
    static boolean  linearsearch2(int[] arr,int tgt,int start,int end) {
        if (arr.length==0) {
            return false;
        }
        int[] arr2 = Arrays.copyOfRange(arr, start, end);//here it automatically doing subtraction by 1 in end part.
        for (int i : arr2) {
            if (tgt==i) {
                return true;
            }
        }
        return false;
    }
}
