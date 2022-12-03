public class starl
{
	public static void main(String args[])
	{
		int i=0,j=0,n=4,k;
		for(i=0;i<=n;i++)
		{
			for(j=0;j<n-i;j++)
			{
				System.out.println("");
			}
			for(k=1;k<=i+1;k++)
			{
				System.out.println("*");
			}
		}
	}
}
