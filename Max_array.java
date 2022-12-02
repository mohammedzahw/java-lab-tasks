import java.util.Scanner;

public class Max_array {
    //function to get the mam element in the array
    static int max_in_array(int a[])
    {
        //an variable to store the max element
        int max=0;
        //loop through the array
        for(int i=0;i<a.length;i++)
        {
            //if the current element is greater than max store it in max
            if(max<a[i])max=a[i];
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //the size of the array
        int n=in.nextInt();
        int arr[]=new int[n];
        //get the array
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        //print the maximum element
        System.out.println(max_in_array(arr));
    }
}