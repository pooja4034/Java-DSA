import java.util.*; //O(n3)

class maxSubarraySum{

    public static void sum(int num[])
    {
        int cursum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++)
        {
            int start=i;
            for(int j=i;j<num.length;j++)
            {
                int end=j;
                cursum=0;
                for(int k=start;k<=end;k++)
                {
                    //sum
                    cursum=cursum+num[k];
                }
                System.out.println(cursum);

                if(maxSum<cursum)
                {
                    maxSum=cursum;
                }
            }
        }
        System.out.println("Max sum is: "+maxSum);
    }
    public static void main(String args[])
    {
        int num[]={2,4,6,8,10};
        sum(num);
    }
}