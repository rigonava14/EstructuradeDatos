package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ControllerLogin {
    @FXML
    TextField txtUsuario;
    @FXML
    PasswordField txtPassword;

    String[][] ArrayUsuarios=new String[3][3];
    String[][] numeroUsuario=new String[3][2];
    @FXML protected void initialize(){
        ArrayUsuarios[0][0]="Rigoberto";ArrayUsuarios[0][1]="Admin";ArrayUsuarios[0][2]="123";
        ArrayUsuarios[1][0]="Juan";ArrayUsuarios[1][1]="Admin2";ArrayUsuarios[1][2]="1232";
        ArrayUsuarios[2][0]="Pedro";ArrayUsuarios[2][1]="Admin3";ArrayUsuarios[2][2]="1233";

        numeroUsuario[0][0]="1";numeroUsuario[0][1]="Usuario 1";
        numeroUsuario[1][0]="2";numeroUsuario[1][1]="Usuario 2";
        numeroUsuario[2][0]="3";numeroUsuario[2][1]="Usuario 3";
    }
    public static int dato;
    public void btnIngresar(ActionEvent Event){

        if (txtUsuario.getText().equals("Admin")){
            dato=0;
        }else if (txtUsuario.getText().equals("Admin2")){
            dato=1;
        }else if (txtUsuario.getText().equals("Admin3")){
            dato=2;
        }
        Busqueda busqueda2 = new Busqueda();
        int indice2=busqueda2.binaria(numeroUsuario,dato);
        String u = txtUsuario.getText();
        String p = txtPassword.getText();
        Busqueda busqueda = new Busqueda();
        int indice= busqueda.secuencial(ArrayUsuarios,u,p);
        if (indice>=0){
            Main.nombreUsuario=ArrayUsuarios[indice][0];
            Main.numeroUsuario=numeroUsuario[indice2][1];
            try {
                Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
                Scene scene = new Scene(root);
                Main.stage.setScene(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Usuario Incorrecto");
            alert.show();
        }
    }
}
