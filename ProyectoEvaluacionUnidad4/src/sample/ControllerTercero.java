package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.LinkedList;

public class ControllerTercero {

    LinkedList<String> listaPuestos = new LinkedList<>();
    LinkedList<String> listaAños = new LinkedList<>();
    LinkedList<String> listaJornadas = new LinkedList<>();

    @FXML ComboBox cmbPuesto;
    @FXML ComboBox cmbJornada;
    @FXML ComboBox cmbAños;
    @FXML TextField txtNum;

    @FXML protected void initialize(){
        listaPuestos.add("Contador Publico");
        listaPuestos.add("Ingeniero en sistemas");
        listaPuestos.add("Ingeniero civil");
        listaPuestos.add("Ingeniero electromecanico");
        listaPuestos.add("Ingeniero mecatronico");
        listaPuestos.add("Dentista");
        listaPuestos.add("Enfermero/a");
        listaPuestos.add("Albañil");
        listaPuestos.add("Personal de limpieza");
        listaPuestos.add("Ayudante de cocina");
        listaPuestos.add("Mesero");

        for (int x = 0; x <listaPuestos.size(); x++) cmbPuesto.getItems().add(listaPuestos.get(x));

        listaJornadas.add("Diurna");
        listaJornadas.add("Nocturna");
        listaJornadas.add("Mixta");

        for (int x=0;x<listaJornadas.size();x++ ) cmbJornada.getItems().add(listaJornadas.get(x));

        listaAños.add("Sin experiencia");
        listaAños.add("1-5 años");
        listaAños.add("5-10 años");
        listaAños.add("Mas de 10 años");

        for (int x=0;x<listaAños.size();x++ ) cmbAños.getItems().add(listaAños.get(x));
    }
    public void volver(ActionEvent event){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            Scene scene = new Scene(root);
            Main.stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ingresar(ActionEvent event){
        if ((cmbJornada.getSelectionModel().getSelectedItem()==null) || (cmbAños.getSelectionModel().getSelectedItem() == null)||(cmbPuesto.getSelectionModel().getSelectedItem()==null)||(txtNum.getText().equals(""))){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("Favor de llenar todos los campos");
            alert.show();
        }

    }

}
