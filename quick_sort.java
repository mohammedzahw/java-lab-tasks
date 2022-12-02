import java.util.Scanner;

public class quick_sort {
    //function to swap two elements in an array
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //function to get partition of the array
    static int partition(int arr[],int low,int heigh)
    {
        //the pivot is the last element in the array
        int pivot=arr[heigh];
        int i=low-1;
        //loop through the array
        for(int j=low;j<=heigh;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,heigh);
        return i+1;
    }
   static void quickSort(int arr[],int low, int high) {

        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);  // Before pi
            quickSort(arr, pi + 1, high); // After pi

        }

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the array size");
        //get the size of the array
        int n=in.nextInt();
        int arr[]=new int [n];
        //loop to get the arrayy
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        //sort the array
        quickSort(arr,0,n-1);

        //print the array
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}