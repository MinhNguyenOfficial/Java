package NguyenTuanMinh_Packages;


	public class Main {
		public static void main(String[] args) {
		    DIEM d1 = new DIEM();
		    d1.NHAPDIEM(0, 0);

		    DIEM d2 = new DIEM();
		    d2.NHAPDIEM(3, 0);

		    DIEM d3 = new DIEM();
		    d3.NHAPDIEM(0, 4);

		    TAMGIAC tg = new TAMGIAC();
		    tg.NHAPTG(d1, d2, d3);

		    if (tg.KIEMTRA()) {
		        double chuvi = tg.CHUVI();
		        double dientich = tg.DIENTICH();
		        System.out.println("Chu vi tam giac la: " + chuvi);
		        System.out.println("Dien tich tam giac la: " + dientich);
		    } else {
		        System.out.println("Ba diem vua nhap khong phai la 3 diem cua tam giac");
		    }

		    DIEM tam = new DIEM();
		    tam.NHAPDIEM(2, 2);

		    DUONGTRON dt = new DUONGTRON();
		    dt.NHAPDT(tam, 1);

		    double chuvi = dt.CHUVI();
		    double dientich = dt.DIENTICH();
		    System.out.println("Chu vi duong tron la: " + chuvi);
		    System.out.println("Dien tich duong tron la: " + dientich);
		}
	}


