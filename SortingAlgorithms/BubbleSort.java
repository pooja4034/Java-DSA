public class BubbleSort {
	
	public static void sorting(int a[])
	{
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j < a.length-1-i;j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	public static void print(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {

		int a[] = {4,5,1,3,2};
		
		BubbleSort.sorting(a);
		BubbleSort.print(a);
		
	}

}
