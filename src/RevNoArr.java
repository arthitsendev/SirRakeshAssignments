//WAP to input 10 numbers in an array display modified array after reversing each element.
import java.util.*;
class RevNoArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10],i,d,r=1;
        System.out.print("Enter 10 numbers=");
        for(i=0;i<10;i++)
            a[i]=sc.nextInt();
        for(i=0;i<10;i++) {
            while(a[i]>0) {
                d=a[i]%10;
                r=r*10+d;
                a[i]=a[i]/10;
            }
            a[i]=r;
            r=0;
        }
        System.out.print("Modfied Array=");
        for(i=0;i<10;i++)
            System.out.print(a[i]+" ");
    }
}
