package sample;

public class Trapec{
    private double osnovanie_top, osnovanie_bottom;

    public double Pol_sum(){
        double Sbot = 0, Stop = 0, Ssum;
        Ssum = (osnovanie_top + osnovanie_bottom) / 2;
        return Ssum;
    }

    public Trapec(double osnovanie_bottom, double osnovanie_top) {
        this.osnovanie_bottom = osnovanie_bottom;
        this.osnovanie_top = osnovanie_top;
    }

    public double getOsnovanie_bottom() {
        return osnovanie_bottom;
    }

    public void setOsnovanie_bottom(double osnovanie_bottom) {
        this.osnovanie_bottom = osnovanie_bottom;
    }

    public double getOsnovanie_top() {
        return osnovanie_top;
    }

    public void setOsnovanie_top(double osnovanie_top) {
        this.osnovanie_top = osnovanie_top;
    }
}

