import java.util.*;
class DoubleLetSeq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String(),upp="";
        char c=' ',c1=' ';
        int i,f=0;
        System.out.print("Enter a string=");
        str=sc.nextLine();
        upp=str.toUpperCase();
        for(i=0;i<str.length()-1;i++) {
            c=str.charAt(i);
            c1=str.charAt(i+1);
            if(c==c1) {
                f++;
            }
        }
        System.out.print("Occurrence of double letter sequence="+f);
    }
}
