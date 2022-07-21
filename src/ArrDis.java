//Enter 10 numbers and print it after reversing each number.
import java.util.Scanner;
class ArrDis {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]=new int[10],i,d,r=0,t;
        System.out.print("Enter 10 numbers=");
        for(i=0;i<10;i++) {
            a[i]=sc.nextInt();
        }
        for(i=0;i<10;i++) {
            t=0;
            t=a[i];
            while(t>0) {
                d = t % 10;
                r = r * 10 + d;
                t = t / 10;
                a[i] = r;
            }
            r=0;
        }
        System.out.print("Modified array=");
        for(i=0;i<10;i++) {
            System.out.print(a[i]+" ");
        }
    }
}