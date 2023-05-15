package Lab4;

public class Nguoi {
	private String ten;
    private int tuoi;
    private char gioiTinh;
    
    public Nguoi() {
      
    }
    
    public Nguoi(String ten, int tuoi, char gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public String getTen() {
        return ten;
    }
    
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    public int getTuoi() {
        return tuoi;
    }
    
    public void setGioiTinh(char gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public char getGioiTinh() {
        return gioiTinh;
    }
    
    public String toString() {
        return "Ten: " + ten + ", Tuoi: " + tuoi + ", Gioi tinh: " + gioiTinh;
    }

}
