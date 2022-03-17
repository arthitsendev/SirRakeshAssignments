import java.util.*;
class Pattern1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int i,j,l;
        for(i=5;i>=1;i--) {
            for(j=5;j>=6-i;j--) {
                System.out.print(j);
            }
            for(j=i*2;j<10-i;j++) {
                System.out.print(" ");
            }
            for(l=6-i;l<=5;l++) {
                if(l!=1) {
                    System.out.print(l);
                }
            }
            System.out.println();
        }
    }
}
