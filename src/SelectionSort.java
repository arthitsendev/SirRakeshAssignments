import java.util.*;
class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10],i,j,p,t=0;
        System.out.print("Enter 10 numbers=");
        for(i=0;i<10;i++)
            a[i]=sc.nextInt();
        for(i=0;i<9;i++) {
            p=i;
            for(j=i+1;j<10;j++) {
                if(a[p]>a[j])
                    p=j;
            }
            t=a[p];
            a[p]=a[i];
            a[i]=t;
        }
        System.out.println("Modified array=");
        for(i=0;i<10;i++)
            System.out.print(a[i]+" ");
    }
}
