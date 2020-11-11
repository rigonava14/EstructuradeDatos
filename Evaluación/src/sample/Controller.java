package sample;

import Peces.Pez;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URI;
import java.util.ResourceBundle;

public class Controller {
@FXML
    TextField txtNacimiento;

    @FXML
    ComboBox cmbPeces;

    @FXML
    ListView lista1;

    @FXML
    public void initialize() {
        cmbPeces.getItems().removeAll(cmbPeces.getItems());
        cmbPeces.getItems().addAll("Trucha por año", "Carpa por año", "Atun por año","Sardina por año");
        cmbPeces.getSelectionModel().select("Elija una opcion");
    }


    String[] ArregloPeces = new String[2];
    int cont = 0;
    public void insertar(ActionEvent event){
            ArregloPeces[cont]= cmbPeces.getSelectionModel().getSelectedItem().toString();
            System.out.print(ArregloPeces[cont]+" ");
            cont++;
            ArregloPeces[cont]= txtNacimiento.getText();
            System.out.print(ArregloPeces[cont]);
            txtNacimiento.setText("");
            cmbPeces.setVisible(false);
            txtNacimiento.setVisible(false);
    }

public void procesar(ActionEvent event){
Pez pez= new Pez(ArregloPeces);
String[] res;
    res = pez.peces_por_anio(ArregloPeces);
lista1.getItems().addAll(res);
cmbPeces.setVisible(true);
txtNacimiento.setVisible(true);
cont=0;
}

}
