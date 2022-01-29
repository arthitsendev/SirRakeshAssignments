import java.util.*;
class StartVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str[]={"OWO", "CAT", "HUMMUS", "CHICKEN", "BEEF", "MUTTON", "MADAN", "AMIT", "MODI", "VAIPO"};
        int i;
        char vow=' ';
        for(i=0;i<10;i++) {
            vow=str[i].charAt(0);
            if(vow=='A'||vow=='E'||vow=='I'||vow=='O'||vow=='U') {
                System.out.print(str[i]+" ");
            }
        }
    }
}
