import java.util.*;

class bubbleSort{

    public static void sorting(int arr[])
    {
        for(int turn=0;turn<arr.length-1;turn++)
        {
            int swap=0;
            for(int j=0;j<arr.length-1-turn;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            System.out.println("No of Swaps: "+swap);
        }
    }
    public static void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[])
    {
        int arr[]={5,4,1,3,2};
        sorting(arr);
        printarr(arr);
    }
}