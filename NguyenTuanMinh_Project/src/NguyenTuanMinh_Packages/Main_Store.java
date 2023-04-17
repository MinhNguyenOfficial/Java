package NguyenTuanMinh_Packages;

import java.util.ArrayList;
import java.util.Scanner;

import NguyenTuanMinh_Packages.STORE.HangDienMay;
import NguyenTuanMinh_Packages.STORE.HangHoa;
import NguyenTuanMinh_Packages.STORE.HangSanhSu;
import NguyenTuanMinh_Packages.STORE.HangThucPham;
import NguyenTuanMinh_Packages.STORE.NgayThang;



public class Main_Store {



	    public static void main(String[] args) {
	        ArrayList<HangHoa> dsHH = new ArrayList<>();

	        nhapHang(dsHH);
	        STORE.inDSHang(dsHH);
	        
	    }

	    public static void nhapHang(ArrayList<HangHoa> dsHH) {
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.print("Nhap loai hang hoa (1: dien may, 2: sanh su, 3: thuc pham, 0: thoat): ");
	            int loai = sc.nextInt();

	            if (loai == 0) {
	                break;
	            }

	            System.out.print("Nhap ma hang: ");
	            String maHang = sc.next();

	            System.out.print("Nhap ten hang: ");
	            String tenHang = sc.next();

	            System.out.print("Nhap nha san xuat: ");
	            String nhaSanXuat = sc.next();

	            System.out.print("Nhap gia: ");
	            double gia = sc.nextDouble();

	            switch (loai) {
	                case 1:
	                    System.out.print("Nhap thoi gian bao hanh: ");
	                    int thoiGianBaoHanh = sc.nextInt();

	                    System.out.print("Nhap dien ap: ");
	                    int dienAp = sc.nextInt();

	                    System.out.print("Nhap cong suat: ");
	                    int congSuat = sc.nextInt();

	                    dsHH.add(new HangDienMay(maHang, tenHang, nhaSanXuat, gia, thoiGianBaoHanh, dienAp, congSuat));
	                    break;
	                case 2:
	                    System.out.print("Nhap loai nguyen lieu: ");
	                    String loaiNguyenLieu = sc.next();

	                    dsHH.add(new HangSanhSu(maHang, tenHang, nhaSanXuat, gia, loaiNguyenLieu));
	                    break;
	                case 3:
	                    NgayThang ngaySanXuat = new NgayThang();
	                    System.out.println("Nhap ngay san xuat: ");
	                    ngaySanXuat.nhap();

	                    NgayThang ngayHetHan = new NgayThang();
	                    System.out.println("Nhap ngay het han: ");
	                    ngayHetHan.nhap();

	                    dsHH.add(new HangThucPham(maHang, tenHang, nhaSanXuat, gia, ngaySanXuat, ngayHetHan));
	                    break;
	                default:
	                    System.out.println("Loai hang hoa khong hop le");
	                    break;
	            }
	        }
	    }
	    
}
