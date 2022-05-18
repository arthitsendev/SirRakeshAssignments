import java.util.*;
class SpcQuestion2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10],i,n,f=0;
        System.out.print("Enter 10 numbers=");
        for(i=0;i<10;i++)
            a[i]=sc.nextInt();
        System.out.print("Enter a number to search=");
        n=sc.nextInt();
        for(i=0;i<10;i++) {
            if(a[i]==n) {
                f=1;
            }
        }
        if(f==1)
            System.out.print(n);
        else
            System.out.print("NO SUCH ELEMENT");
    }
}
