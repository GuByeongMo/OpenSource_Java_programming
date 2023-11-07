package java_ex100;
import java.util.Scanner;
public class ex_100_20
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int yyy = scan.nextInt();
		Scanner scan2 = new Scanner(System.in);
		int mm = scan.nextInt();
		Scanner scan3 = new Scanner(System.in);
		int dd = scan.nextInt();
		int total=yyy+mm+dd;
		System.out.printf("%d\n%.1f",total,(float)total/3);
		scan.close();
		scan2.close();
		scan3.close();
	}

}