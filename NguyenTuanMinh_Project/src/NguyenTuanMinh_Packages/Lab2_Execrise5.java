package NguyenTuanMinh_Packages;

import java.util.Scanner;

public class Lab2_Execrise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int values = 0, sum = 0;
		while(sum <= 100) {
			System.out.println("Nhập giá trị : ");
			values = sc.nextInt();
			sum += values;
			System.out.println(sum);
		}
	}

}

