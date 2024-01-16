import java.util.*;

class ArrayArgunment{

    public void update(int marks[])
    {
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=marks[i]+1;
        }
    }

    public static void main(String args[])
    {
        ArrayArgunment aa = new ArrayArgunment();

        int marks[]={91,92,93};

        aa.update(marks);

        for(int i=0;i<marks.length;i++)
        {
          System.out.println("Marks are updated by one = "+marks[i]);
        }
    }
}