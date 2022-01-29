//WAP to input a string and display the words in different lines.
import java.util.*;
class DispWordDiffLine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String(),w="";
        int i;
        char c=' ';
        System.out.print("Enter a string=");
        str=sc.nextLine();
        str=str.trim();
        str=str+" ";
        for(i=0;i<str.length();i++) {
            c=str.charAt(i);
            if(c!=' ')
                w=w+c;
            else {
                System.out.println(w);
                w="";
            }
        }
    }
}
