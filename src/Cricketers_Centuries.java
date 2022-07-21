//Enter the name of players, their countries and the number of centuries they made into three arrays and enter the first letter of the country's name and search for the cricketer.
import java.util.*;
class Cricketers_Centuries {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        String str[]=new String[20];
        String con[]=new String[20];
        char n=' ',c=' ';
        int cen[]=new int[20],i;
        System.out.print("Enter the name of players, their countries and the number of centuries=");
        for(i=0;i<20;i++) {
            str[i]=sc.nextLine();
            con[i]=sc.nextLine();
            cen[i]=sc.nextInt();
        }
        System.out.print("Enter the first letter of the country's name you want to search=");
        n=sc.nextLine().charAt(0);
        for(i=0;i<20;i++) {
            c=con[i].charAt(0);
            if(n==c) {
                System.out.print(str[i]+" "+con[i]+" "+cen[i]);
            }
        }
    }
}
