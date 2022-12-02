import java.util.Scanner;

public class askii_code {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //get the askii code form the user
        int x=in.nextInt();
        //print the the letter
        System.out.println((char) x);
    }
}