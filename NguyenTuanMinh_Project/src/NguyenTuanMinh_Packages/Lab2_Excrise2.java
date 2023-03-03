package NguyenTuanMinh_Packages;

import java.util.Scanner;

public class Lab2_Excrise2 {
	public static void main(String[] args) {
	int number;
	System.out.println("Nhập số nguyên: ");
	Scanner sc = new Scanner(System.in);
	number = sc.nextInt();
	if(number % 2 == 0) {
		System.out.println("Số chẵn");
	}else {
		System.out.println("Số lẻ");
	}
	}
}
