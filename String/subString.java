import java.util.*;

class subString{

    public static String stringsub(String str,int si,int ei)
    {
        String substr="";
        for(int i=si;i<ei;i++)
        {
           substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[])
    {
        String str="HelloWorld";
        System.out.println(stringsub(str,2,6));
    }
}