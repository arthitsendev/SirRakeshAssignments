import java.util.*;
class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        char ch;
        String str = new String(), w = "";
        System.out.print("Enter a string=");
        str = sc.next();
        for (i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) == -1) {
                w = w + ch;
            }
        }
        System.out.print(w);
    }
}
