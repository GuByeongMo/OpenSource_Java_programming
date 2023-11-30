package java_ex100;
import java.util.Scanner;

public class ex100_96 {
	public static void main(String[] args) {

		String[][] students = new String[50][2];

		Scanner scan = new Scanner(System.in);
		int n = 5;
		for(int i=0; i<5; i++) {
			students[i][1] = scan.next();
			students[i][0] = scan.next();
		}

		for(int i=0; i<5; i++) {
			for(int j=i+1; j<5; j++) {
				int score1 = Integer.parseInt(students[i][1]);
				int score2 = Integer.parseInt(students[j][1]);
				if(score2>score1) {
					String temp1 = students[i][0];
					String temp2 = students[i][1];
					students[i][0] = students[j][0];//�̸�
					students[i][1] = students[j][1];//����
					students[j][0] = temp1;
					students[j][1] = temp2;
				}
			}
		}
		System.out.println("세번째 학생은");
		System.out.println(students[2][0]);
		System.out.println(students[2][1]);
	}

}