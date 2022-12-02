import java.util.Scanner;

public class array_transpose {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // the number of rows and colomns
        int row,colomns;
        System.out.println("enter the array rows and colomns");
        row= in.nextInt();
        colomns=in.nextInt();
        int arr[][]=new int [row][colomns];
        //get the array
        for(int i=0;i<row;i++)
        {
            for (int j=0;j<colomns;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        //print the transpose by repalceing the rows with the colomns
        for(int i=0;i<colomns;i++)
        {
            for (int j=0;j<row;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }

    }
}