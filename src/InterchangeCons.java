import java.util.*;
class InterchangeCons {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10],i,c=0;
        for(i=0;i<10;i++)
            a[i]=sc.nextInt();
        for(i=0;i<10;i=i+2) {
            c=a[i];
            a[i]=a[i+1];
            a[i+1]=a[i];
            c=0;
        }
        System.out.print("Modified Array=");
        for(i=0;i<10;i++) {
            System.out.print(a[i]+" ");
        }
    }
}
