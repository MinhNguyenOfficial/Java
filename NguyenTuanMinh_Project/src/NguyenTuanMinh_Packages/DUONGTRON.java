package NguyenTuanMinh_Packages;

public class DUONGTRON extends DIEM {
    private DIEM tam;
    private double r;

    public void NHAPDT(DIEM tam, double r) {
        this.tam = tam;
        this.r = r;
    }

    public double CHUVI() {
        return 2 * Math.PI * r;
    }

    public double DIENTICH() {
        return Math.PI * r * r;
    }
}


