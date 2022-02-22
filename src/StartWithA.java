import java.util.*;
class StartWithA {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        String str=new String(),w="";
        char c=' ';
        int i,f=0;
        System.out.print("Enter a sentence=");
        str=sc.nextLine();
        str=str.trim();
        str=str+" ";
        for(i=0;i<str.length();i++) {
            c=str.charAt(i);
            if(c!=' ') {
                w=w+c;
            }
            else {
                if(w.charAt(0)=='A') {
                    f++;
                }
            }
        }
        System.out.print("Total number of words starting with the letter A= "+f);
    }
}
