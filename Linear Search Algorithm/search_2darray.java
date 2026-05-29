import java.util.Arrays;

public class search_2darray {
    public static void main(String[] args) {
        int[][] arr={
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,22}
        };
        int target = 34;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        
    }
    static int[] search(int[][] arr,int target) {
        if (arr.length==0){
            return null;
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr[i].length-1; j++) {
                if (arr[i][j]==target) {
                    return new int[]{i,j};
                }                
            }            
        }
        return null;
    }    
}
