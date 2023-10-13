package pattern;

public class P3 {
	
	public static void main(String[] args) {
		int k=4;
		for(int i=1;i<=4;i++)
		{
			for(int j=k;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
			k--;
		}
	}

}
