//WAP to input 10 numbers in an array and check if single digit numbers are present or not.
import java.util.*;
class SingleDigArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10],i,c=0,f=0;
        System.out.print("Enter 10 numbers=");
        for(i=0;i<10;i++)
            a[i]=sc.nextInt();
        for(i=0;i<10;i++) {
            while (a[i]>0) {
                c++;
                a[i]=a[i]/10;
            }
            if (c == 1)
                f++;
        }
        if(f>0)
            System.out.println("Single digit numbers are present.");
        else
            System.out.println("Single digit numbers are not present.");
    }
}