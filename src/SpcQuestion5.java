import java.util.*;
class SpcQuestion5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=new String(),str2=new String();
        int len1,len2;
        System.out.print("Enter two strings=");
        str1=sc.next();
        str2=sc.next();
        str1=str1.toUpperCase();
        str2=str2.toUpperCase();
        if(str1.equals(str2)==true) {
            System.out.print("Both the strings are of equal length");
        }
        else {
            len1=str1.length();
            len2=str2.length();
            if(len1>len2)
                System.out.print("String with highest length="+len1);
            else
                System.out.print("String with highest length="+len2);
        }
    }
}
