import java.util.*;
class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10],i,l,u,m,n,f=0;
        System.out.print("Enter 10 numbers=");
        for(i=0;i<10;i++)
            a[i]=sc.nextInt();
        l=0;
        u=9;
        System.out.print("Enter a number to search=");
        n=sc.nextInt();
        while(l<=u) {
            m=(l+u)/2;
            if(n<a[m]) {
                u=m-1;
            }
            else if(n>a[m]) {
                l=m+1;
            }
            else {
                f=1;
                break;
            }
        }
        if(f==1)
            System.out.print("Search successful");
        else
            System.out.print("Search unsuccessful");
    }
}
