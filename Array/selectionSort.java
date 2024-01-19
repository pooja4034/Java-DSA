import java.util.*;

class selectionSort{

    public static void sort(int num[])
    {
        for(int i=0;i<num.length-1;i++)
        {
            int minpos=i;
            for(int j=i+1;j<num.length;j++)
            {
                if(num[minpos]>num[j])
                {
                    minpos=j;
                }
            }
            //swap
            int temp=num[minpos];
            num[minpos]=num[i];
            num[i]=temp;
        }
    }
    public static void printarr(int num[])
    {
        for(int i=0;i<num.length;i++)
        {
            System.out.print(num[i]);
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int num[]={5,4,1,3,2};
        sort(num);
        printarr(num);
    }
}