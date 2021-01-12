package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.converter.IntegerStringConverter;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.function.UnaryOperator;

public class ControllerSegundo{
    @FXML  TextField txtNombre;
    @FXML  TextField txtNum;
    @FXML  ComboBox cmbPuesto;
    @FXML  ComboBox cmbJornada;
    @FXML  ComboBox cmbAños;

    LinkedList<String> listaPuestos = new LinkedList<>();
LinkedList<String> listaJornada = new LinkedList<>();
LinkedList<String> listaAnios = new LinkedList<>();

    public static ObservableList<Buscar> listaBuscar = FXCollections.observableArrayList();
     public static Stack<Buscar2> pila = new Stack<>();
     public static Queue<Buscar2> cola = new LinkedList<>();
@FXML protected  void initialize(){
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

    listaJornada.add("Diurna");
    listaJornada.add("Nocturna");
    listaJornada.add("Mixta");

    for (int x=0;x<listaJornada.size();x++ ) cmbJornada.getItems().add(listaJornada.get(x));

    listaAnios.add("Sin experiencia");
    listaAnios.add("1-5 años");
    listaAnios.add("5-10 años");
    listaAnios.add("Mas de 10 años");

    for (int x=0;x<listaAnios.size();x++ ) cmbAños.getItems().add(listaAnios.get(x));
}

    public void volver(ActionEvent event) {
    try {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root);
        Main.stage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
}


    public void Postular(ActionEvent event) {

        if ((cmbJornada.getSelectionModel().getSelectedItem()==null) || (cmbAños.getSelectionModel().getSelectedItem() == null)||(cmbPuesto.getSelectionModel().getSelectedItem()==null)||(txtNombre.getText().equals(""))||(txtNum.getText().equals(""))){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setContentText("Favor de llenar todos los campos");
            alert.show();
        }else {
            String nombre = txtNombre.getText();
            String numero= txtNum.getText();
            String puesto = cmbPuesto.getSelectionModel().getSelectedItem().toString();
            String jornada = cmbJornada.getSelectionModel().getSelectedItem().toString();
            String años = cmbAños.getSelectionModel().getSelectedItem().toString();

            listaBuscar.add(new Buscar(nombre,puesto,jornada,años,numero));
            String[][] items = new String[listaBuscar.size()][5];
            for (int x=0;x<listaBuscar.size();x++){
                items[x][0] = listaBuscar.get(x).getNombre();
                items[x][1] = listaBuscar.get(x).getPuesto();
                items[x][2] = listaBuscar.get(x).getJornada();
                items[x][3] = listaBuscar.get(x).getAños();
                items[x][4] = listaBuscar.get(x).getNumero();
            }
            Buscar2 buscar2 = new Buscar2(items,nombre,puesto,jornada,años,numero);
            pila.add(buscar2);
            cola.add(buscar2);


            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("La informacion ha sido ingresada correctamente");
            alert.show();

            cmbPuesto.getSelectionModel().clearSelection();
            cmbJornada.getSelectionModel().clearSelection();
            cmbAños.getSelectionModel().clearSelection();
            txtNum.setText("");
            txtNombre.setText("");

        }

    }


    public void empleos(ActionEvent event){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Pantalla4.fxml"));
            Scene scene = new Scene(root);
            Main.stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}//Llave class
