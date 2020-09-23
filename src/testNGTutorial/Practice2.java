package testNGTutorial;

public class Practice2 {

	public static void  reverseNo(int N) {
		
		int reverse;
		System.out.println(N);
		
		while(N!=0)
		{
			reverse= N%10;
			N= N/10;
		}
		
		//System.out.println(reverse);
		System.out.println(N);

	}
	

	public static void main(String[] args) {

		//Practice2 ss = new Practice2();
		//reverseNo(134);
		
		int ar[] = {2,3,4,5};
		
		int size= ar.length;
		for (int i=0;i<size;i++)
		{
			for (int j=0;j<=i;j++)
			{
				if (ar[i]+ar[j]==7)
				{
					System.out.println(ar[i]+ " "+ ar[j] );
				}
				
				
			}
		}
		
		

	}
}
