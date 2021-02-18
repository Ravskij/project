package sample;

public class Area extends Trapec{
    private double h;
    public Area(double osnovanie_bottom, double osnovanie_top, double h) {
        super(osnovanie_bottom, osnovanie_top);
        this.h = h;
    }

    public double Plosh(){
        double ts = 0;
        ts = Pol_sum() * h;
        return ts;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
