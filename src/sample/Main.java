package sample;
/**
 * @autor Равский Андрей
 * @version v1
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Класс Main
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("My project");
        primaryStage.setScene(new Scene(root, 775, 400));
        primaryStage.show();
    }

    /**
     * Метод указываюзий интерпретатору с чего нужно начать выполнение программы
     *
     * @param args - параметр метода launch
     */
    public static void main(String[] args) {
        launch(args);
    }
}
