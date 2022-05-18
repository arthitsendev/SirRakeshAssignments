import java.util.*;
class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10],i,j,t=0;
        System.out.print("Enter 10 numbers=");
        for(i=0;i<10;i++)
            a[i]=sc.nextInt();
        for(i=0;i<9;i++) {
            for(j=0;j<9-i;j++) {
                if(a[j]>a[j+1]) {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("Modified array=");
        for(i=0;i<10;i++)
            System.out.print(a[i]+" ");
    }
}
