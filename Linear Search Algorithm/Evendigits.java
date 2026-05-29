public class Evendigits {
    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public static void main(String[] args) {
        int[] num ={18,2345,-45,-76,-7645,34255};
        System.out.println(findNumbers(num));
    }  
    
    static int findNumbers(int[] num) {
        int number = 0;
        for (int e : num) {
            if(e<0) e=-e;
            if(even(e) %2 ==0) number++;
        }
        return number;
    }
    static int even(int e) {
        return (int)(Math.log10(e))+1;
    }
}
