package Lab4;

public class Test {
    public static void main(String[] args) {
     
        BenhVien benhVien = new BenhVien("Benh vien ABC", "Ha Noi", "BS Minh");
        
        
        BenhNhan benhNhan = new BenhNhan();
        benhNhan.setTienSu("Om");
        benhNhan.setChanDoan("Ung Thu");
        benhNhan.setBenhVien(benhVien);
        
        // Kiểm tra các phương thức của lớp BenhNhan
        System.out.println("Tien su: " + benhNhan.getTienSu());
        System.out.println("Chan doan: " + benhNhan.getChanDoan());
        System.out.println("Benh vien: " + benhNhan.getBenhVien().toString());
        System.out.println(benhNhan.toString());
    }
}
