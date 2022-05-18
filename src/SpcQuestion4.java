import java.util.*;
class SpcQuestion4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a[]=new double[20],s=0.0,l=0.0;
        int i;
        System.out.print("Enter 20 numbers of double data type=");
        for(i=0;i<20;i++)
            a[i]=sc.nextDouble();
        for(i=0;i<20;i++) {
            s=s+a[i];
            if(l<a[i]) {
                l=a[i];
            }
        }
        System.out.println("Sum of all the elements="+s);
        System.out.print("Highest value="+l);
    }
}
