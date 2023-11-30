package java_ex100;
import java.util.Scanner;

public class ex100_91 {

	//1 2 3 4 5
	//2 3 4 5 1
	//3 4 5 1 2
	//4 5 1 2 3
	//5 1 2 3 4
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int[1000];
		for(int i=0; i<n; i++) {
			nums[i] = scan.nextInt();
		}
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				System.out.print(nums[j]+" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print(nums[k]+" ");
			}
			System.out.println();
		}
	}
}
