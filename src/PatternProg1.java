import java.util.*;
class PatternProg1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,ch,j;
        String str=new String();
        System.out.println("MENU:");
        System.out.println("1. Print Pattern 1");
        System.out.println("2. Print Pattern 2");
        System.out.print("Enter your choice=");
        ch=sc.nextInt();
        switch(ch) {
            case 1:
                System.out.print("Enter a word=");
                str=sc.next();
                for(i=0;i<str.length();i++) {
                    System.out.println(str.substring(i,str.length()));
                }
                break;
            case 2:
                for(i=5;i>=1;i--) {
                    for(j=i;j>=1;j--) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
                break;
            default :
                System.out.print("Invalid option");
        }
    }
}
