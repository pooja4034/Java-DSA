import java.util.*;

class fibonacci{

    public static int fib(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        int fm1=fib(n-1);
        int fm2=fib(n-2);
        int tot=fm1+fm2;

        return tot;
    }
    public static void main(String args[])
    {
        int n=6;
        System.out.print(fib(n));
    }
}