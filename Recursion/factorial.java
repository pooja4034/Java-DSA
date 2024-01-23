import java.util.*;

class factorial{

    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else{

            return n*fact(n-1);
        }
    }
    public static void main(String args[])
    {
        int n=8;
        System.out.println(fact(n));
    }
}