/*Copyright By Arthit Sen. Respect Copyright and abide the laws enacted by it.*/
import java.util.*;
class PerfStringFun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c;
        String str=new String(),upp="",low="",w="",rev="";
        int i,a;
        System.out.print("Enter a string=");
        str=sc.nextLine();
        for(i=0;i<str.length();i++) {
            c=str.charAt(i);
            rev=c+rev;
            a=(int)c;
            if(a>=97&&a<=122) {
                c=(char)(a-32);
            }
            if(a>=65&&a<=91) {
                c=(char)(a+32);
            }
            w=w+c;
        }
        System.out.print("Reverse of the string="+rev);
        System.out.print("After changing the letters, the final output="+w);
    }
}
