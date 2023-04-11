package NguyenTuanMinh_Packages;

import java.util.Scanner;

public class SACH {
	String ma, ten, tg;
	int trang, tap, gia;
	String loai, nxb;
	
	void nhapSach() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã sách : ");
		ma = sc.nextLine();
		System.out.println("Nhập tên sách : ");
		ten = sc.nextLine();
		System.out.println("Nhập tên tác giả : ");
		tg = sc.nextLine();
		System.out.println("Nhập số trang : ");
		trang = sc.nextInt();
		System.out.println("Nhập số tập : ");
		tap = sc.nextInt();
		System.out.println("Nhập giá tiền : ");
		gia = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập loại sách : ");
		loai = sc.nextLine();
		System.out.println("Nhập nhà xuất bản sách : ");
		nxb = sc.nextLine();
	}
	
	void inSach() {
		System.out.println("Mã Sách : " + ma + " \nTên sách : " + ten + " \nTác giả : " + tg + "\nSố trang : " + trang + " \nSố tập : " + tap + "\nGiá : " + gia + "\nThể loại : " + loai + " \nNhà xuất bản : " + nxb );
	}
	
	public static void main(String[] args) {
//		SACH sach = new SACH();
//	    sach.nhapSach();
		SACH[] sachArr = new SACH[10];
	    int index = 0;
	    Scanner sc = new Scanner(System.in);
	    while (true) {
	        SACH sach = new SACH();
	        sach.nhapSach();
	        sachArr[index] = sach;
	        index++;
	        System.out.println("Bạn có muốn nhập tiếp không? (y/n)");
	        String answer = sc.nextLine();
	        
	        if (!answer.equalsIgnoreCase("y")) {
	            break;
	        }
	    }
	    System.out.println("Danh sách các cuốn sách:");
	    for (int i = 0; i < index; i++) {
	        sachArr[i].inSach();
	        System.out.println("\n");
	    }
	}
}
