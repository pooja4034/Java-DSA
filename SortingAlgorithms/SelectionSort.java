public class SelectionSort {

	public static void sorting(int a[])
	{
		for(int i =0;i<a.length-1;i++)
		{
			int minpos = i; //storing current position as minimum position
			for(int j=i+1;j<a.length;j++)
			{
				if(a[minpos] > a[j])
				{
					minpos = a[j];
				}
			}
			//swaping
			int temp = a[minpos];
			a[minpos] = a[i];
			a[i] = temp; //swaping minpos in current position
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

		int a[] = {3,5,1,2,4};
		
		SelectionSort.sorting(a);
		SelectionSort.print(a);

	}

}
