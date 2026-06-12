import java.util.*;

public class Recursion_Basic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recurs(n);
    }
    public static int recurs(int n) {
        if(n==4){
            return 0;
        }
        System.out.println(n);
        recurs(n+1);
        return -1;
    }
}