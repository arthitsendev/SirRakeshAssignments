import java.util.*;
class SpcQuestion3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c[]=new char[10];
        int i,f=0,g=0;
        System.out.print("Enter 10 characters into the array=");
        for(i=0;i<10;i++)
            c[i]=sc.next().charAt(0);
        for(i=0;i<10;i++) {
            if(Character.isUpperCase(c[i])==true)
                f++;
            if("AEIOUaeiou".indexOf(c[i])!=-1)
                g++;
        }
        System.out.println("Number of uppercase letters in the array="+f);
        System.out.print("Number of vowels in the array="+g);
    }
}
