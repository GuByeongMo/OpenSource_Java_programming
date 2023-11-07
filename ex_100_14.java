package java_ex100;
import java.util.Scanner;
public class ex_100_14 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		Scanner scan2 = new Scanner(System.in);
		int minute = scan.nextInt();
		System.out.printf("%d:%d",hour,minute);
		scan.close();
		scan2.close();
	}

}