//WAP to input 10 numbers into an array and find highest and smallest number.
import java.util.*;
class HighSmallArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10],i,c=0,d,l=0,s=0;
        System.out.print("Enter 10 numbers=");
        for(i=0;i<10;i++)
            a[i]=sc.nextInt();
        for(i=0;i<10;i++) {
            while(a[i]>0) {
                d=a[i]%10;
                c++;
                if(c>0)
                    l=s=d;
                if(l<d)
                    l=d;
                if(s>d)
                    s=d;
                System.out.print("Highest and smallest digit of "+a[i]+"="+l+" "+s);
                l=0;
                s=0;
                a[i]=a[i]/10;
            }
        }
    }
}