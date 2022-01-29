import java.util.Scanner;
class MoreAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[15],i,avg,sum=0;
        System.out.print("Enter 15 numbers=");
        for(i=0;i<15;i++) {
            a[i]=sc.nextInt();
        }
        for(i=0;i<15;i++) {
            sum=sum+a[i];
        }
        avg=sum/15;
        System.out.println("Numbers more than the average=");
        for(i=0;i<10;i++) {
            if(a[i]>avg) {
                System.out.print(a[i] +" ");
            }
        }
    }
}
