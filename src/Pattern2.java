import java.util.*;
class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=6;i>=1;i--) {
            for(j=i;j>=1;j--) {
                if(i!=1) {
                    System.out.print(j);
                }
            }
            if(i!=1) {
                System.out.println();
            }
        }
        for(i=1;i<=6;i++) {
            for(j=i;j>=1;j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
