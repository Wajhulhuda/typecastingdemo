package typecastingdemo;

public class maxNumber {
	public static void main(String [] args) {
		int[] arr = {23,45,34,34,54,65,5};
		int max=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("Maximum number is "+ max);
	}

}
