import java.util.*;
class Unique_Word {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        char c=' ',c1=' ';
        int i,f=0,j;
        System.out.print("Enter a word=");
        str=sc.nextLine();
        str=str.trim();
        str=str.toUpperCase();
        for(i=0;i<str.length();i++) {
            c=str.charAt(i);
            for(j=0;j<str.length();j++) {
                c1=str.charAt(i);
                if(c==c1) {
                    f=1;
                }
            }
        }
        if(f==0) {
            System.out.print("Unique word");
        }
        else {
            System.out.print("Not a unique word");
        }
    }
}
