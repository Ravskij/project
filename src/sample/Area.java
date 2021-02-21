package sample;
/**
 * Класс насследуемый от класса Трапеция
 */
public class Area extends Trapec {
    /**
     * Поле: высота трапеции
     */
    private double h;

    /**
     * Конструктор - создание нового объекта с определенными значениями
     *
     * @param osnovanie_bottom - верхнее основание
     * @param osnovanie_top    - нижнее основание
     * @param h                - высота
     */
    public Area(double osnovanie_bottom, double osnovanie_top, double h) {
        super(osnovanie_bottom, osnovanie_top);
        this.h = h;
    }

    /**
     * Конструктор - вычисление площади трапеции
     *
     * @return возвращает площадь
     */
    public double Plosh() {
        double ts = 0;
        ts = Pol_sum() * h;
        return ts;
    }

    /**
     * Геттер
     *
     * @return h
     */
    public double getH() {
        return h;
    }

    /**
     * Сеттер
     *
     * @param h - высота
     */
    public void setH(double h) {
        this.h = h;
    }
}
