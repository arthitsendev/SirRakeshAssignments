import java.util.*;
class PrintTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,c;
        String str=new String();
        System.out.println("MENU:");
        System.out.println("1. Print a triangle.");
        System.out.println("2. Print an inverted triangle.");
        System.out.println("Enter a choice=");
        c=sc.nextInt();
        System.out.print("Enter a word=");
        str=sc.next();
        switch(c) {
            case 1:
                for(i=0;i<str.length();i++) {
                    for(j=0;j<=i;j++) {
                        System.out.print(str.charAt(j));
                    }
                    System.out.println();
                }
                break;
            case 2:
                for(i=str.length()-1;i>=0;i--) {
                    for(j=0;j<=i;j++) {
                        System.out.print(str.charAt(j));
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.print("Invalid choice");
        }
    }
}
