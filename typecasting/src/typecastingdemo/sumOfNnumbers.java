package typecastingdemo;

public class sumOfNnumbers {
	public static void main(String [] args) {
		int[] arr = {45,4,66,46,46,35,57,87,57,46,3,34};
		int sum=0;
		int i;
		for(i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("The sum of numbers is "+ sum);	
	}

}
