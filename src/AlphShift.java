import java.util.*;
class AlphShift {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        char ch;
        System.out.print("Enter a character=");
        ch=sc.next().charAt(0);
        System.out.print("Enter the shifting value=");
        x=sc.nextInt();
        y=ch+x;
        if(y>122 && Character.isLowerCase(ch)==true) {
            System.out.println((char)(96+(y-122)));
        }
        else if(y>90 && Character.isUpperCase(ch)==true) {
            System.out.print((char)(64+y-97));
        }
        else {
            System.out.print(ch+x);
        }
    }
}
