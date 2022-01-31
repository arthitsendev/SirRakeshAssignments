import java.util.*;
class AltWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,f=0;
        char ch;
        String str=new String(),w="";
        System.out.print("Enter a word=");
        str=sc.nextLine();
        str=str.trim();
        str=str+" ";
        for(i=0;i<str.length();i++) {
            ch=str.charAt(i);
            if(ch!=' ') {
                w=w+ch;
            }
            if(ch==' ') {
                f++;
                if(f%2!=0) {
                    System.out.print(w+" ");
                }
            }
        }
    }
}
