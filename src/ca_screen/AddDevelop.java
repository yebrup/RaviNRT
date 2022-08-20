package ca_screen;

public class AddDevelop {

	public static void main(String[] args) {
		int n=6;
		for(int k=0;k<n;k++)
		{
			for (int i=n-k;i>0;i--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<2*k+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
