import java.util.Scanner;
class RepHighest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10],i,d,c=0,l=0,t;
        System.out.print("Enter 10 numbers=");
        for(i=0;i<10;i++) {
            a[i]=sc.nextInt();
        }
        for(i=0;i<10;i++) {
            t=a[i];
            while(t>0) {
                d=t%10;
                c++;
                if(c>0)
                    l=d;
                if(l>d)
                    l=d;
                t=t/10;
            }
            a[i]=l;
            l=0;
        }
        System.out.println("Modified Array=");
        for(i=0;i<10;i++) {
            System.out.println(a[i]+" ");
        }
    }
}
