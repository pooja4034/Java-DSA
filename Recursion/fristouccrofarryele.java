import java.util.*;

class fristouccrofarryele{

    public static int fristoccure(int arr[],int key,int i)
    {
        if(arr[i]==arr.length)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }

        return fristoccure(arr,key,i+1);
    }
    public static void main(String args[])
    {
        int arr[]={3,5,6,8,4,6,9};

        System.out.println(fristoccure(arr,6,0));
    }

}