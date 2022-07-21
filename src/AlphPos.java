//Enter a word and display the position of each character in the alphabetical table.
import java.util.*;
class AlphPos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        int i,ci,pos;
        char c=' ';
        System.out.print("Enter a word=");
        str=sc.nextLine();
        str=str.trim();
        for(i=0;i<str.length();i++) {
            c=str.charAt(i);
            ci=(int)c;
            pos=ci-64;
            System.out.print(pos);
        }
    }
}
