import java.util.*;

class stringCompare{

    public static boolean check(String str1,String str2, String str3)
    {
       if(str1.equals(str3)) //equals is function
       {
        System.out.println("String is Equal");
        return true;
       }
       else{
        System.out.println("String is not Equal");
        return false;
       }
    }
    public static void main(String args[])
    {
        String str1="abcd";
        String str2="abcd";
        String str3= new String("abcd");

        System.out.println(check(str1,str2,str3));
    }
}