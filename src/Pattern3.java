import java.util.*;
class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,k,l,m;
        for(i=4;i>=1;i--) {
            for(j=1;j<=4;j++) {
                if(j<=i)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            for(j=4;j>=1;j--) {
                if(j<=i)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(i=2;i<=4;i++) {
            for(j=1;j<=i;j++) {
                System.out.print(j);
            }
            for(j=i*2;j<8;j++) {
                System.out.print(" ");
            }
            for(j=i;j>=1;j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
