import java.util.*; // O(log n)

class BinarySearch{

    public static int search(int num[],int key)
    {
        int start=0,end=num.length;

        while(start<=end)
        {
            int mid=(start+end)/2;

            if(num[mid]==key)
            {
                return mid; //found
            }
            else if(num[mid] < key)
            {
                start=mid+1; //right side
            }
            else
            {
                end=mid-1; //left side
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int num[]={2,4,6,7,8,9,14};
        int key=8;

        System.out.println("Key index is : "+search(num,key));
    }
}