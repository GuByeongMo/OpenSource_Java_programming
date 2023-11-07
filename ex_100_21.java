package java_ex100;
import java.util.Scanner;
public class ex_100_21
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		Scanner scan2 = new Scanner(System.in);
		int b = scan.nextInt();
		double f = a * Math.pow(2, b);
		
		
		System.out.printf("%.0f",f);
		scan.close();
		scan2.close();
	}

}