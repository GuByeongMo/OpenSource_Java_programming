package java_ex100;
import java.util.Scanner;
public class ex100_92 {

	public static void main(String[] args) {
		int[] motherNum = {18,29,48,39,24,23,11,77,99,55};
		for(int m : motherNum) {
			System.out.print(m+" ");
		}
		System.out.println();

		try {
			Thread.sleep(5000); //5ÃÊ
		}catch(Exception e) { }

		for(int i=0; i<50; i++)
			System.out.println("...");

		System.out.println("3¹øÂ° ¼ýÀÚ´Â?");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		boolean isExist = false;
		if(num==motherNum[2]) {
			isExist = true;
		}

		if(isExist==true) {
			System.out.println("Á¤´ä!");
		}else {
			System.out.println("¿À´ä!");
		}


	}

}