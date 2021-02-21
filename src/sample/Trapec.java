package sample;
/**
 * Класс Трапеция
 */
public class Trapec {
    /**
     * Поля: верхнее и нижнее основание трапеции
     */
    private double osnovanie_top, osnovanie_bottom;

    /**
     * Конструктор - создание нового объекта с определенными значениями
     *
     * @param osnovanie_bottom - верхнее основание
     * @param osnovanie_top    - нижнее основание
     */
    public Trapec(double osnovanie_bottom, double osnovanie_top) {
        this.osnovanie_bottom = osnovanie_bottom;
        this.osnovanie_top = osnovanie_top;
    }

    /**
     * Конструктор - вычисление полусуммы оснований
     *
     * @return возвращает полусумму
     */
    public double Pol_sum() {
        double Sbot = 0, Stop = 0, Ssum;
        Ssum = (osnovanie_top + osnovanie_bottom) / 2;
        return Ssum;
    }

    /**
     * Геттер
     *
     * @return osnovanie_bottom
     */
    public double getOsnovanie_bottom() {
        return osnovanie_bottom;
    }

    /**
     * Сеттер
     *
     * @param osnovanie_bottom - нижнее основание
     */
    public void setOsnovanie_bottom(double osnovanie_bottom) {
        this.osnovanie_bottom = osnovanie_bottom;
    }

    /**
     * Геттер
     *
     * @return osnovanie_top
     */
    public double getOsnovanie_top() {
        return osnovanie_top;
    }

    /**
     * Сеттер
     *
     * @param osnovanie_top - верхнее основание
     */
    public void setOsnovanie_top(double osnovanie_top) {
        this.osnovanie_top = osnovanie_top;
    }
}