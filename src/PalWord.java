//WAP to input a string and display the palindrome words only.
import java.util.*;
class PalWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String(),w="",w1="";
        int i;
        char c=' ';
        System.out.print("Enter a string=");
        str=sc.nextLine();
        str=str.trim();
        str=str+" ";
        for(i=0;i<str.length();i++) {
            c=str.charAt(i);
            if(c!=' ') {
                w=w+c;
                w1=c+w1;
            }
            else {
                if(w==w1) {
                    System.out.println(w);
                    w="";
                }
            }
        }
    }
}
