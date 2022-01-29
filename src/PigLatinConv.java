import java.util.*;
class PigLatinConv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String(),upp="",sb="",sb1="";
        char c=' ';
        int i,ind;
        System.out.print("Enter a string=");
        str=sc.nextLine();
        upp=str.toUpperCase();
        for(i=0;i<str.length();i++) {
            c=str.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
                ind=i;
                sb=str.substring(ind,str.length());
                sb1=str.substring(0,ind);
                break;
            }
        }
        System.out.print(sb+sb1+"AY");
    }
}
