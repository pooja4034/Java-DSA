import java.util.*;

public class ArrayPaires{

    public static void paires(int number[])
    {
        for(int i=0;i<number.length;i++)
        {
            int curr=number[i];
            for(int j=i+1;j<number.length;j++)
            {
                System.out.println("("+curr+","+number[i]+")");
            }
        }
    }
    public static void main(String args[])
    {
        int number[]={2,4,6,8,10};
        paires(number);
    }
}