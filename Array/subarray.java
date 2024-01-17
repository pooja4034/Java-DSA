import java.util.*;

public class subarray{

    public static void sarray(int num[])
    {
        for(int i=0;i<num.length;i++)//start
        {
            int ts=0;
            int start=i;
            for(int j=i;j<num.length;j++)//end
            {
                int end=j;
                for(int k=start;k<=end;k++)//print
                {
                    System.out.println(num[k]+" ");//sunarray
                }
                ts++;
                System.out.println();
            }
            System.out.println("Total count of SubArray: "+ts);   
        }
    }
    public static void main(String args[])
    {
        int num[]={2,4,6,8,10};
        sarray(num);
    }
}