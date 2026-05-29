public class searchinStrings {
    public static void main(String[] args) {
        String name = "Satya";
        char target = 'a';
        System.out.println(search(name,target));
    }
    static boolean search(String name,char target) {
        if (name.length()==0) {
            return false;
        }
        // for (int i = 0; i < name.length(); i++) {
        //     if (target==name.charAt(i)) {
        //         return true;
        //     }
        // }
        //for this type of for loop you need to convert string into the character array
        for (char i : name.toCharArray()) {
            if (target==i) {
                return true;
            }
        }
        return false;
    }
}
