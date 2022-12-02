import java.util.Scanner;
import static java.lang.Math.min;
public class ncr_npr {
    // function to determine permutations
    public static int per(int n,int r)
    {
        int sum=1;
        for(int i=n;i>(n-r);i--)
        {
            sum*=i;
        }
        return sum;
    }
    //function to count combination
    public static int com (int n,int r)
    {
        int sum=1;
        //loop to get factorial
        for(int i=r;i>=1;i--)
        {
            sum*=i;
        }
        return per(n,r)/sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //get the input from the user
        int n = in.nextInt();
        int r = in.nextInt();

        //print the permutation and combination
        System.out.print("permutation = " + per(n, r) + "\ncomination  = " + com(n, r));

    }
}