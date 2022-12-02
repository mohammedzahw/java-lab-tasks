import java.util.Scanner;

public class string_comma {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //get the string from the user
        String s=in.nextLine();
        //replace the comma with"" and print
        System.out.println(s.replace(",",""));

    }
}