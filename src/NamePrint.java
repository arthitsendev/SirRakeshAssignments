//WAP in Java to accept a name containing three words and display the surname first, followed by the first and middle name.
import java.util.*;
class NamePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String(), first = "", sur = "";
        int i, space;
        System.out.print("Enter a name=");
        str = sc.nextLine();
        space = str.lastIndexOf(" ");
        first = str.substring(0, space);
        sur = str.substring(space + 1);
        System.out.print(sur + " " + first);
    }
}
