package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    @FXML
    private TextField OsnovanieTopFx;

    @FXML
    private TextField OsnovanieBotFx;

    @FXML
    private TextField Height;

    @FXML
    private TextField OutputTrapec;

    @FXML
    private TextField OutputArea;

    public void Exit() {
        System.exit(1);
    }

    public void About() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Об авторе");
        alert.setHeaderText("Автор программы");
        alert.setContentText("Равский А.В.");
        alert.showAndWait();
    }

    public void TrapecFX(){
        String strTop = "";
        String strBot = "";
        strTop = OsnovanieTopFx.getText();
        strBot = OsnovanieBotFx.getText();
        if(strTop.length() != 0 & strBot.length() != 0) {
            double osnovanieDoubleTop = Double.parseDouble(strTop);
            double osnovanieDoubleBot = Double.parseDouble(strBot);
            Trapec a = new Trapec(osnovanieDoubleTop, osnovanieDoubleBot);
            String outputString = Double.toString(a.Pol_sum());
            OutputTrapec.setText(outputString);
        }
    }

    public void AreaFX() {
        String strTop = "";
        String strBot = "";
        String strH = "";
        strTop = OsnovanieTopFx.getText();
        strBot = OsnovanieBotFx.getText();
        strH = Height.getText();
        if(strTop.length() != 0 & strBot.length() != 0 & strH.length() != 0) {
            double osnovanieDoubleTop = Double.parseDouble(strTop);
            double osnovanieDoubleBot = Double.parseDouble(strBot);
            double heightDouble = Double.parseDouble(strH);
            Area b = new Area(osnovanieDoubleTop, osnovanieDoubleBot, heightDouble);
            String outputString = Double.toString(b.Plosh());
            OutputArea.setText(outputString);
        }
    }
}
