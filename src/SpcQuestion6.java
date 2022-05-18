import java.util.*;
class SpcQuestion6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String(),w="",w1="";
        char c=' ';
        int i;
        System.out.print("Enter a string=");
        str=sc.nextLine();
        str=str.trim();
        str=str.toLowerCase();
        for(i=0;i<str.length();i++) {
            c=str.charAt(i);
            w=w+c;
            w1=c+w1;
        }
        if(w.equals(w1)==true)
            System.out.print("Palindrome string");
        else
            System.out.print("Not a palindrome string");
    }
}
