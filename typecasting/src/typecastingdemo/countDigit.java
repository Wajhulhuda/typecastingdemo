package typecastingdemo;

public class countDigit {
	public static void main(String [] args) {
		int count=0;
		int sum=0;
		int num=453456544;
		while(num>0) {
			sum=sum+(num%10);
			count++;
			num=num/10;
		}
		System.out.println("Number of digit is "+ count);
		
	}

}
