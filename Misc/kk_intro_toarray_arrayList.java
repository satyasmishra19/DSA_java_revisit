
import java.util.ArrayList;
import java.util.Scanner;

public class kk_intro_toarray_arrayList {
    public static void main(String[] args){
        // array
        // all element have one data type,
        // datatype[] variable_name = new datatype[size];

        //int[] ros;// declaration of array
        //ros = new int[5]; //initialization
        Scanner sc = new Scanner(System.in);
        // int[][] mat = new int[3][2];
        // System.out.println(mat.length);

        // for (int i = 0; i < mat.length; i++) {
        //     for (int j = 0; j < mat[0].length; j++) {
        //         mat[i][j]=sc.nextInt();
        //     }
        // }
        // for (int i = 0; i < mat.length; i++) {
        //     for (int j = 0; j < mat[0].length; j++) {
        //         System.out.print(mat[i][j]);
        //     }
        // }


        //arraylist
        // ArrayList<Integer> list = new ArrayList<>(5);

        // list.add(11);
        // list.add(11);
        // list.add(11);
        // list.add(11);
        // list.add(11);
        // list.add(11);
        // list.add(11);
        // list.add(12);
        // list.add(11);
        // list.add(11);
        // list.add(11);
        // list.add(11);
        // list.add(11);

        // System.out.println(list);
        // System.out.println(list.set(0, 7));
        // System.out.println(list);
        // System.out.println(list.remove(7));
        // System.out.println(list);

        // for (int i = 0; i < 4; i++) {
        //     list.add(sc.nextInt());
        // }

        // for (int i = 0; i < 4; i++) {
        //     System.out.print(list.get(i));
        // }

        //2-D Arraylist
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialisation 
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
