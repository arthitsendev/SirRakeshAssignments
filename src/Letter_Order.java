import java.util.*;
class Letter_Order {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        int i,j,f=0;
        char c,c1;
        System.out.print("Enter a string=");
        str=sc.nextLine();
        str=str.toUpperCase();
        str=str.trim();
        for(i=0;i<str.length();i++) {
            c=str.charAt(i);
            for(j=0;j<str.length();j++) {
                c1=str.charAt(j);
                if(c==c1) {
                    f++;
                }
            }
            System.out.println("Frequency of "+c+"="+f);
            f=0;
        }
    }
}
