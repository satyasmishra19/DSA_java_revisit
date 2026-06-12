
import java.util.Scanner;


public class count_num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count=0;
        int rr=countnum(x,count);
        System.out.println(rr);
    }
    public static int countnum(int x,int count){
        if (x==0) {
            return (count==0)?1:count;   
        }
        return countnum(x/10, count+1);
    }
}