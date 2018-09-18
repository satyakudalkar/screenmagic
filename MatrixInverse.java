public class MatrixInverse
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int mat[][]={{1,0,0,0},{0,1,0,0},{0,4,1,0},{0,2,0,1}};
		for(int i=0;i<4;i++)
		{
		    for(int j=0;j<4;j++)
		    {
		        if(i!=j && mat[i][j]!=0)
		        {
		            mat[i][j]=-mat[i][j];
		        }
		    }
		}
		System.out.println("New Matrix is ");
		for(int i=0;i<4;i++)
		{
		    for(int j=0;j<4;j++)
		    {
		        System.out.print(" "+mat[i][j]);
		    }
		    System.out.println();
		}
	}
}
