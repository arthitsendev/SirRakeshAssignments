import java.util.*;
class StringModify {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String(),w="";
        char c=' ',c1,c2;
        int i;
        System.out.println("Enter a string=");
        str=sc.nextLine();
        str=str.trim();
        str=str+" ";
        str=str.toUpperCase();
        for(i=0;i<str.length();i++) {
            c=str.charAt(i);
            if(c!=' ')
                w=w+c;
            else {
                c1=w.charAt(0);
                c2=w.charAt(w.length()-1);
                String s1=w.substring(1,w.length()-1);
                System.out.print(c2+s1+c1);
                w="";
            }
        }
    }
}
