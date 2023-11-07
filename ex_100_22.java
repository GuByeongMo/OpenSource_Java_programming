package java_ex100;
import java.util.Scanner;
public class ex_100_22
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		Scanner scan2 = new Scanner(System.in);
		int b = scan.nextInt();
		int result=0;
		if (a>b)
			result=1;
		else
			result=0;
		
		
		
		System.out.printf("%d",result);
		scan.close();
		scan2.close();
	}

}