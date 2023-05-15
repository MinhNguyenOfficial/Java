package Lab4;

public class BenhNhan {
    private String tienSu;
    private String chanDoan;
    private BenhVien benhVien;
    
    public BenhNhan() {
        
    }
    
    public BenhNhan(String tienSu, String chanDoan, BenhVien benhVien) {
        this.tienSu = tienSu;
        this.chanDoan = chanDoan;
        this.benhVien = benhVien;
    }
    
    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }
    
    public String getTienSu() {
        return tienSu;
    }
    
    public void setChanDoan(String chanDoan) {
        this.chanDoan = chanDoan;
    }
    
    public String getChanDoan() {
        return chanDoan;
    }
    
    public void setBenhVien(BenhVien benhVien) {
        this.benhVien = benhVien;
    }
    
    public BenhVien getBenhVien() {
        return benhVien;
    }
    
    public String toString() {
        return "Tien su: " + tienSu + ", Chan doan: " + chanDoan + ", Benh vien: " + benhVien.toString();
    }
}
