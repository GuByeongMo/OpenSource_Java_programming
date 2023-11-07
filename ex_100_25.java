package java_ex100;
import java.util.Scanner;
public class ex_100_25
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		Scanner scan2 = new Scanner(System.in);
		int b = scan.nextInt();
		int result=0;
		if (b!=a)
			result=1;
		else
			result=0;
		
		
		
		System.out.printf("%d",result);
		scan.close();
		scan2.close();
	}

}