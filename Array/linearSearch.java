import java.util.*;

class linearSearch{
      public static int search(int num[],int key)
      {
        for(int i=0;i<num.length;i++)
        {
            if(num[i]==key)
            {
              return i;
            }
        }
        return -1;
      }
      public static void main(String args[])
      {
        int num[]={4,6,7,2,9,8,0};
        int key=8;

        int index=search(num,key);

        if(index==-1)
        {
            System.out.println("Not Found");
        }
        else{

            System.out.println("Found = "+ index);
        }
      }
}