import java.util.*;
class largestNo{
    public static int maxarray(int num[])
    {
        int large=Integer.MIN_VALUE; //- infinity 
        for(int i=0;i<num.length;i++)
        {
            if(large < num[i])
            {
                large=num[i];
            }
        }
        return large;
    }
    public static void main(String args[])
    {
        int num[]={3,6,8,4,5,9,6,2};

        System.out.println("Largest No is : " +maxarray(num));
    }
}