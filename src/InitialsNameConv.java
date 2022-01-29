import java.util.*;
class InitialsNameConv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=new String();
        int i,ind=0;
        char c=' ';
        System.out.print("Enter your name= ");
        name=sc.nextLine();
        name=name.toUpperCase();
        System.out.print(name.charAt(0)+". ");
        for(i=0;i<name.length();i++) {
            c=name.charAt(i);
            if(c==' ') {
                System.out.print(name.charAt(i+1)+". ");
                break;
            }
        }
        for(i=name.length()-1;i>=0;i--) {
            c=name.charAt(i);
            if(c==' ') {
                ind=i+1;
                break;
            }
        }
        System.out.print(name.substring(ind,name.length()));
    }
}
