import java.util.*;
class Palindrome_Word {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        String str=new String(),w="",w1="";
        int i;
        char c=' ';
        System.out.print("Enter a word=");
        str=sc.next();
        str=str.toUpperCase();
        for(i=0;i<str.length();i++) {
            c=str.charAt(i);
            w=w+c;
            w1=c+w1;
        }
        if(w.equals(w1)==false) {
            System.out.print(w+w1);
        }
        else {
            System.out.print(str);
        }
    }
}
