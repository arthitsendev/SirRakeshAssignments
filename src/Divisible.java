import java.util.*;
class Divisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,a[]=new int[10000],i,c=0,ld=0,n1=0,t;
        n=sc.nextInt();
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        t=n;
        c=t-1;
        for(i=0;i<n;i++) {
            ld=a[i]%10;
            n1=n1+ld*(int)Math.pow(10,c--);
        }
        if(n1%10==0) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}
