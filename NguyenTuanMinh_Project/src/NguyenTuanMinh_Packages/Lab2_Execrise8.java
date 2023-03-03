package NguyenTuanMinh_Packages;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_Execrise8 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int quantity, sum = 0;
		System.out.println("Nhập số lượng phần tử : ");
		quantity = sc.nextInt();
		for(int i = 1; i <= quantity; i++){
			System.out.println("Nhập phần tử thứ " + i + " :");
			numbers.add(sc.nextInt());
		}
		for (int num : numbers) {
            sum += num;
        }
		System.out.println("Trung bình cộng của các số " + numbers + " là : " + sum / quantity );
	}
}
