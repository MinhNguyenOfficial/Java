package NguyenTuanMinh_Packages;

public class TAMGIAC extends DIEM {
    private DIEM a;
    private DIEM b;
    private DIEM c;

    public void NHAPTG(DIEM a, DIEM b, DIEM c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean KIEMTRA() {
        double ab = Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
        double ac = Math.sqrt(Math.pow(c.x - a.x, 2) + Math.pow(c.y - a.y, 2));
        double bc = Math.sqrt(Math.pow(c.x - b.x, 2) + Math.pow(c.y - b.y, 2));
        return (ab + ac > bc && ab + bc > ac && ac + bc > ab);
    }

    public double CHUVI() {
        double ab = Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
        double ac = Math.sqrt(Math.pow(c.x - a.x, 2) + Math.pow(c.y - a.y, 2));
        double bc = Math.sqrt(Math.pow(c.x - b.x, 2) + Math.pow(c.y - b.y, 2));
        return ab + ac + bc;
    }

    public double DIENTICH() {
        double ab = Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
        double ac = Math.sqrt(Math.pow(c.x - a.x, 2) + Math.pow(c.y - a.y, 2));
        double bc = Math.sqrt(Math.pow(c.x - b.x, 2) + Math.pow(c.y - b.y, 2));
        double p = (ab + ac + bc) / 2;
        return Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
    }
}

