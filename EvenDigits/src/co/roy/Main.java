package co.roy;

public class Main {
	public static void main(String[] args) {
		int[] arr= {12,345,2,6,7896,67,2323,122};
		System.out.print(ndigits(arr));
	}
	
	static int even(int num) {
//		int count=0;
//		while(num>0) {
//			count++;
//			num/=10;
//		}
//		return count;
		//*********OR********
		return (int)(Math.log10(num)+1);
		
	}
	
	static int ndigits(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(even(arr[i]) % 2==0) {
				count++;	
			}
		}
		return count;
	}

}
