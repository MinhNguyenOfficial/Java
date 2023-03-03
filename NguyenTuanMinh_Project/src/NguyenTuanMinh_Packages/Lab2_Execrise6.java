package NguyenTuanMinh_Packages;

import java.util.Scanner;

public class Lab2_Execrise6 {
	public static void main(String[] args) {
		int number, factorial = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số cần tìm giai thừa : ");
		number = sc.nextInt();
		for(int i = number; i > 0; i--) {
			factorial *= i;
		}
		System.out.println(number + "! = " + factorial);
	}
}
