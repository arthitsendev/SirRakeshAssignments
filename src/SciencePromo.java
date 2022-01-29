/*To get promotion in a Science stream, a student must score an average marks of 45% and above.
Define a class to store the names and average marks in two single dimensional arrays. The program
should check and display the names along with a message whether "Promotion is Granted" or
"Promotion is not Granted". Assume that there are 40 students in the class.*/
import java.util.*;
class SciencePromo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int avg[]=new int[40],i;
        String str[]=new String[40];
        System.out.print("Enter the name and average marks of 40 students=");
        for(i=0;i<40;i++) {
            avg[i]=sc.nextInt();
            str[i]=sc.nextLine();
        }
        for(i=0;i<40;i++) {
            if(avg[i]>=45) {
                System.out.print(str[i]+" "+"Promotion is granted.");
            }
            else
                System.out.print(str[i]+" "+"Promotion is not granted.");
        }
    }
}
