import java.util.*;

class twoDarray_Finding_Ele{

  public static boolean twoD(int matrix[][],int key)
  {
    for(int i=0;i<matrix.length;i++)
    {
        for(int j=0;j<matrix[0].length;j++)
        {
            if(matrix[i][j]==key)
            {
                System.out.println("Found At Cell("+ i +","+ j +")");
                return true;
            }
        }
    }
    return false;
  }    
  public static void main(String args[])
  {
    int matrix[][]=new int[2][2];
    int n=matrix.length,m=matrix[0].length;
    int key=3;

    Scanner sc = new Scanner(System.in);

    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++)
      {
        
        matrix[i][j]=sc.nextInt();
      }
    }

    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++)
      {
        System.out.println(matrix[i][j]);
      }
    }
    twoD(matrix,key);
  }
}