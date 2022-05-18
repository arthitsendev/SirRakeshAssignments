//Copyright Program done by Arthit Sen. Distribution of code not allowed.
import java.util.*;
class FirstLastWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String(),fword="",lword="";
        char c=' ';
        int i,first_index,last_index;
        System.out.print("Enter a string=");
        str=sc.nextLine();
        str=str.trim(); //Don't add a space to the string so that we can find the last word without loop
        first_index=str.indexOf(' '); //First index of space
        last_index=str.lastIndexOf(' ');
        fword=str.substring(0,first_index); //Substring from the beginning of the string to the character before the first space
        lword=str.substring(last_index+1); //Substring from the character after last space to the end of the string
        System.out.println("First word= "+fword);
        System.out.print("Last word= "+lword);
    }
}
