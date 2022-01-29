import java.util.*;
class PatternProg2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        int i,ch,j,c1;
        char c=' ';
        System.out.println("MENU:");
        System.out.println("1. Print all special characters from the entered string.");
        System.out.println("2. Print a pattern.");
        System.out.print("Enter your choice=");
        ch=sc.nextInt();
        switch(ch) {
            case 1:
                System.out.print("Enter a string=");
                str=sc.next();
                for(i=0;i<str.length();i++) {
                    c=str.charAt(i);
                    c1=(int)c;
                    if((c1!=32)&&!(c1>=48&&c1<=57)&&!(c1>=65&&c1<=90)&&!(c1>=97&&c1<=122)) {
                        System.out.print((char)c1);
                    }
                }
                break;
            case 2:
                System.out.print("Enter a word=");
                str=sc.next();
                for(i=0;i<str.length();i++) {
                    System.out.println(str.substring(i,str.length())+str.substring(0,i));
                }
                break;
            default:
                System.out.print("Invalid option");
        }
    }
}
