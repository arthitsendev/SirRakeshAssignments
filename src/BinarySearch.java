import java.util.*;
class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,a[]=new int[10],n,l=0,u,m,p=0,e=0,f=0;
        System.out.print("Enter 10 numbers=");
        for(i=0;i<10;i++)
            a[i]=sc.nextInt();
        System.out.print("Enter a number to search=");
        n=sc.nextInt();
        l=0;
        u=9;
        while(l<=u) {
            m=(l+u)/2;
            if(a[m]<n)
                l=m+1;
            else if(a[m]>n)
                u=m-1;
            else {
                f=1;
                p=m;
                e=a[m];
                break;
            }
        }
        if(f==1)
            System.out.print("Element= "+e+" "+"Position= "+p);
        else
            System.out.print("Search element not found");
    }
}
