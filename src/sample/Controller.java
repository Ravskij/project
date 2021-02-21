package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

/**
 * Класс для связи графического интерфейса с программой
 */
public class Controller {
    /**
     * Текстовое поле: верхнее основание
     */
    @FXML
    private TextField OsnovanieTopFx;
    /**
     * Текстовое поле: нижнее основание
     */
    @FXML
    private TextField OsnovanieBotFx;
    /**
     * Текстовое поле: высота
     */
    @FXML
    private TextField Height;
    /**
     * Текстовое поле: вывод полусуммы оснований
     */
    @FXML
    private TextField OutputTrapec;
    /**
     * Текстовое поле: вывод площади
     */
    @FXML
    private TextField OutputArea;

    /**
     * Функция закрытия программы
     */
    public void Exit() {
        System.exit(1);
    }

    /**
     * Функция описания автора программы
     */
    public void About() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Об авторе");
        alert.setHeaderText("Автор программы");
        alert.setContentText("Равский А.В.");
        alert.showAndWait();
    }

    /**
     * Функция
     * принимает значения из текстового поля
     * и передает значения в класс
     * Trapec
     */
    public void TrapecFX() {
        String strTop = "";
        String strBot = "";
        strTop = OsnovanieTopFx.getText();
        strBot = OsnovanieBotFx.getText();
        if (strTop.length() != 0 & strBot.length() != 0) {
            double osnovanieDoubleTop = Double.parseDouble(strTop);
            double osnovanieDoubleBot = Double.parseDouble(strBot);
            Trapec a = new Trapec(osnovanieDoubleTop, osnovanieDoubleBot);
            String outputString = Double.toString(a.Pol_sum());
            OutputTrapec.setText(outputString);
        }
    }

    /**
     * Функция
     * принимает значения из текстового поля
     * и передает значения в класс
     * Area
     */
    public void AreaFX() {
        String strTop = "";
        String strBot = "";
        String strH = "";
        strTop = OsnovanieTopFx.getText();
        strBot = OsnovanieBotFx.getText();
        strH = Height.getText();
        if (strTop.length() != 0 & strBot.length() != 0 & strH.length() != 0) {
            double osnovanieDoubleTop = Double.parseDouble(strTop);
            double osnovanieDoubleBot = Double.parseDouble(strBot);
            double heightDouble = Double.parseDouble(strH);
            Area b = new Area(osnovanieDoubleTop, osnovanieDoubleBot, heightDouble);
            String outputString = Double.toString(b.Plosh());
            OutputArea.setText(outputString);
        }
    }
}
