package NguyenTuanMinh_Packages;

import java.util.Scanner;

public class Lab2_Execrise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = new String();
		int age;
		System.out.println("Họ và tên của bạn: ");
		Scanner sc= new Scanner(System.in);
		name = sc.nextLine();
		System.out.println("Bạn bao nhiêu tuổi?");
		age = sc.nextInt();
		if(age < 16) {
			System.out.println("Bạn "+ name + " ở độ tuổi vị thành niên!");
		}else if(age >= 16 && age < 18) {
			System.out.println("Bạn "+ name + " ở độ tuổi trưởng thành!");
		}else {
			System.out.println("Bạn "+ name + " đã già!");
		}
	}

}
