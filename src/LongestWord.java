//WAP to input a string and print the longest word.
import java.util.*;
class LongestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String(),w="",hw="";
        int i,l,h=0;
        char c=' ';
        System.out.print("Enter a string=");
        str=sc.nextLine();
        str=str.trim();
        str=str+" ";
        for(i=0;i<str.length();i++) {
            c=str.charAt(i);
            if(c!=' ') {
                w=w+c;
            }
            else {
                if(h==0) {
                    hw=w;
                    h=w.length();
                }
                else if(w.length()>h) {
                    hw=w;
                    h=w.length();
                }
            }
        }
    }
}
