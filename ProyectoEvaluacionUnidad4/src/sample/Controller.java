package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;



public class Controller {
    @FXML
    Label txtUsuario,txtNum;
    @FXML protected void initialize(){
        txtUsuario.setText(Main.nombreUsuario);
        txtNum.setText(Main.numeroUsuario);
    }
    public void Ingresar(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Pantalla2.fxml"));
            Scene scene = new Scene(root);
            Main.stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void ofrecer(ActionEvent event){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Pantalla3.fxml"));
            Scene scene = new Scene(root);
            Main.stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void lista (ActionEvent event){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Pantalla4.fxml"));
            Scene scene = new Scene(root);
            Main.stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

