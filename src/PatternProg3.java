import java.util.*;
class PatternProg3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        int i,c,k;
        System.out.print("Enter a word=");
        str=sc.nextLine();
        c=str.length();
        for(i=str.length()-1;i>=0;i--) {
            for(k=i;k<str.length()-1;k++) {
                System.out.print(" ");
            }
            System.out.println(str.substring(0,i+1));
        }
    }
}
