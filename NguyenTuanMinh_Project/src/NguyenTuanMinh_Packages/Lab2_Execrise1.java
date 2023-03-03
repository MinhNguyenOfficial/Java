package NguyenTuanMinh_Packages;

import java.util.Scanner;

public class Lab2_Execrise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float firstNumber, secondNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập hai số thực: ");
		firstNumber = sc.nextFloat();
		secondNumber = sc.nextFloat();
		System.out.println("Tổng :" + (firstNumber + secondNumber));
		System.out.println("Hiệu :" + (firstNumber - secondNumber));
		System.out.println("Tích :" + (firstNumber * secondNumber));
		System.out.println("Thương :" + (firstNumber / secondNumber));
		System.out.println("Chia dư :" + (firstNumber % secondNumber));
	}

}
