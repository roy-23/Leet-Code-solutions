package co.roy;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		sc.close();
		System.out.print(isPalindrome(x));
	}
	public static boolean isPalindrome(int x) {
        int original=x;
        int rev=0;
		while(x>0) {
        	int rem=x%10;
        	rev=rev*10 + rem;
        	x=x/10;
        }
		
		return rev==original;
    }
}
