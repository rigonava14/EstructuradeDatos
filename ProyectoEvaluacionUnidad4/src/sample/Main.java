package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import static javafx.fxml.FXMLLoader.load;

public class Main extends Application {
    public static String nombreUsuario="";
    public static String numeroUsuario="";
    public static Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        stage= primaryStage;
        Parent root = load(getClass().getResource("Login.fxml"));
        primaryStage.setTitle("Bolsa de Trabajo");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.getIcons().add(new Image("./sample/img/Icono.png"));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
