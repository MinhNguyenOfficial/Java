package NguyenTuanMinh_Packages;

import java.util.Scanner;

public class Lab2_Execrise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số từ 1 đến 12 :");
		month = sc.nextInt();
		if(month >= 1 && month <= 12) {
			System.out.println("Tháng "+ month);
		}else {
			System.out.println("Số không hợp lệ!");
		}
	}

}
