package typecastingdemo;

public class primeNumber {
	public static void main(String [] args) {
		int n=29;
		int m=n/2, flag=0;
		if(n == 0 || n == 1) {
			System.out.println("Not a prime number");
		}
		else
		{
			for(int i=2; i<=m; i++)
			{
				if(n%i==0) {
					System.out.println("Its  not a prime number");
					flag=1;
					break;
					
				}
			}
			if(flag==0) {
				System.out.println("Prime number");
			}
		}
	}

}
