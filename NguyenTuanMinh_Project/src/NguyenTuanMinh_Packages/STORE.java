package NguyenTuanMinh_Packages;

import java.util.ArrayList;
import java.util.Scanner;

import NguyenTuanMinh_Packages.STORE.HangHoa;

public class STORE {

    public static class HangHoa {
        String maHang;
        String tenHang;
        String nhaSanXuat;
        double gia;

        public HangHoa(String maHang, String tenHang, String nhaSanXuat, double gia) {
            this.maHang = maHang;
            this.tenHang = tenHang;
            this.nhaSanXuat = nhaSanXuat;
            this.gia = gia;
        }

        @Override
        public String toString() {
            return "Ma hang: " + maHang + ", Ten hang: " + tenHang + ", Nha san xuat: " + nhaSanXuat + ", Gia: " + gia;
        }
    }

    public static class HangDienMay extends HangHoa {
        int thoiGianBaoHanh;
        int dienAp;
        int congSuat;

        public HangDienMay(String maHang, String tenHang, String nhaSanXuat, double gia, int thoiGianBaoHanh, int dienAp, int congSuat) {
            super(maHang, tenHang, nhaSanXuat, gia);
            this.thoiGianBaoHanh = thoiGianBaoHanh;
            this.dienAp = dienAp;
            this.congSuat = congSuat;
        }

        @Override
        public String toString() {
            return super.toString() + ", Thoi gian bao hanh: " + thoiGianBaoHanh + " thang, Dien ap: " + dienAp + " V, Cong suat: " + congSuat + " W";
        }
    }

    public static class HangSanhSu extends HangHoa {
        String loaiNguyenLieu;

        public HangSanhSu(String maHang, String tenHang, String nhaSanXuat, double gia, String loaiNguyenLieu) {
            super(maHang, tenHang, nhaSanXuat, gia);
            this.loaiNguyenLieu = loaiNguyenLieu;
        }

        @Override
        public String toString() {
            return super.toString() + ", Loai nguyen lieu: " + loaiNguyenLieu;
        }
    }

    public static class NgayThang {
        int ngay;
        int thang;
        int nam;

        public void nhap() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap ngay: ");
            ngay = sc.nextInt();
            System.out.print("Nhap thang: ");
            thang = sc.nextInt();
            System.out.print("Nhap nam: ");
            nam = sc.nextInt();
        }

        @Override
        public String toString() {
            return ngay + "/" + thang + "/" + nam;
        }
    }

    public static class HangThucPham extends HangHoa {
        NgayThang ngaySanXuat;
        NgayThang ngayHetHan;

        public HangThucPham(String maHang, String tenHang, String nhaSanXuat, double gia, NgayThang ngaySanXuat
, NgayThang ngayHetHan) {
	        super(maHang, tenHang, nhaSanXuat, gia);
	        this.ngaySanXuat = ngaySanXuat;
	        this.ngayHetHan = ngayHetHan;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + ", Ngay san xuat: \" + ngaySanXuat.toString() + \", Ngay het han: \" + ngayHetHan.toString()";
	    }
	}
    public static void inDSHang(ArrayList<HangHoa> dsHH) {
        for (HangHoa hh : dsHH) {
            System.out.println(hh.toString());
        }
    }

}

