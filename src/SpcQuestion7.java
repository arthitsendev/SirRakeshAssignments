import java.util.*;
class SpcQuestion7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str[]=new String[10];
        int i,len=0;
        System.out.print("Enter 10 strings=");
        for(i=0;i<10;i++) {
            str[i]=sc.next();
            str[i]=str[i].trim();
        }
        for(i=0;i<10;i++) {
            len=str[i].length();
            if(len%2==0)
                System.out.print(str[i]+" ");
        }
    }
}
