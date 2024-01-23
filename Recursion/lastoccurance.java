import java.util.*;

class lastoccurance{

    public static int lastocc(int arr[],int key,int i)
    {
        if(i ==arr.length)
        {
            return -1;
        }

        int isFound= lastocc(arr,key,i+1);

        if(isFound == -1 && arr[i] == key)
        {
            return i;
        }
        return isFound;
    }
    public static void main(String args[])
    {
        int arr[]={4,3,3,3,2,1,1};

        System.out.println(lastocc(arr,3,0));
    }
}