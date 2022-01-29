import java.util.*;
class BEAM {
    int m;
    BEAM() {
        m=0;
    }
    void Accept() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number=");
        m=sc.nextInt();
    }
    void Calculate() {
        int d=0,s=0;
        while(m>0) {
            d=m%10;
            s=s+(d*d);
        }
        if(s>m)
            System.out.print("The number is a beam number.");
        else
            System.out.print("The number is not a beam number.");
    }
    public static void main(String[] args) {
        BEAM ob=new BEAM();
        ob.Accept();
        ob.Calculate();
    }
}
