import java.util.*;
class ReplaceLetter_E {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        String str=new String(),w="";
        char c=' ';
        int i;
        System.out.print("Enter a sentence=");
        str=sc.nextLine();
        str=str.trim();
        str=str+" ";
        for(i=0;i<str.length();i++) {
            c=str.charAt(i);
            if(c!=' ') {
                if(c!='e') {
                    w=w+c;
                }
                else {
                    w=w+'*';
                }
            }
            else {
                System.out.print(w+" ");
                w="";
            }
        }
    }
}
