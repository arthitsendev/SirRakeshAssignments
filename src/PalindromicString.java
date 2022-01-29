import java.util.*;
class PalindromicString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String(),w="";
        char c=' ';
        int i;
        str=sc.next();
        for(i=0;i<str.length();i++) {
            c=str.charAt(i);
            w=c+w;
        }
        if(str.equals(w)==true) {
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}