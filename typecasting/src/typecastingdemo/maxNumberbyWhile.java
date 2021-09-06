package typecastingdemo;

public class maxNumberbyWhile {
	public static void main(String [] args) {
		int max=0;
		
		int[] arr= {34,54,34,46,77,56,45,34,54,57,75};
		int i=0;
		while(i<arr.length) {
			if(max<arr[i]) {
				max=arr[i];
			}
			i++;
		}
		System.out.println("Maximum number is "+ max);
	}

}
