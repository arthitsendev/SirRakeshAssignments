import java.util.*;
class HalfHighSmall {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10],i,h=0,c=0,s=0;
        for(i=0;i<10;i++)
            a[i]=sc.nextInt();
        for(i=0;i<5;i++) {
            c++;
            if(c>0)
                h=a[i];
            if(h<a[i])
                h=a[i];
        }
        c=0;
        for(i=5;i<10;i++) {
            c++;
            if(c>0)
                s=a[i];
            if(s>a[i])
                s=a[i];
        }
        System.out.print("Highest number from 1 st half="+h+"\n"+"Smallest number from 2nd half="+s);
    }
}
