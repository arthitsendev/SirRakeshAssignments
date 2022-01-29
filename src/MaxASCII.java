import java.util.*;
class MaxASCII {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String(),w="",w1="";
        char c=' ';
        int i,a=0,l=0;
        System.out.print("Enter a string=");
        str=sc.nextLine();
        str=str.trim();
        str=str+" ";
        for(i=0;i<str.length();i++) {
            c=str.charAt(i);
            if(c!=' ') {
                a=a+(int)c;
                w=w+c;
            }
            else {
                if(a>l) {
                    l=a;
                    w1=w;
                }
                w="";
            }
        }
        System.out.print("Word with max ASCII value="+w1);
    }
}
