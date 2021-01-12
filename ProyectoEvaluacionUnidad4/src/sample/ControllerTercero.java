package sample;

import javafx.collections.FXCollections;
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
import java.util.Queue;
import java.util.Stack;

public class ControllerTercero {

    LinkedList<String> listaPuestos = new LinkedList<>();
    LinkedList<String> listaAños = new LinkedList<>();
    LinkedList<String> listaJornadas = new LinkedList<>();

    @FXML ComboBox cmbPuesto;
    @FXML ComboBox cmbJornada;
    @FXML ComboBox cmbAños;
    @FXML TextField txtNum;
    public static ObservableList<Ofrecer> ListaOfrecer = FXCollections.observableArrayList();
    public static Stack<Ofrecer2> pila = new Stack<>();
    public static Queue<Ofrecer2> cola = new LinkedList<>();
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
        }else {
            String numero= txtNum.getText();
            String puesto = cmbPuesto.getSelectionModel().getSelectedItem().toString();
            String jornada = cmbJornada.getSelectionModel().getSelectedItem().toString();
            String años = cmbAños.getSelectionModel().getSelectedItem().toString();

            ListaOfrecer.add(new Ofrecer(puesto,jornada,años,numero));
            String[][] items = new String[ListaOfrecer.size()][4];
            for (int x=0;x<ListaOfrecer.size();x++){
                items[x][0] = ListaOfrecer.get(x).getPuesto();
                items[x][1] = ListaOfrecer.get(x).getJornada();
                items[x][2] = ListaOfrecer.get(x).getAños();
                items[x][3] = ListaOfrecer.get(x).getNumero();
            }
            Ofrecer2 ofrecer2 = new Ofrecer2(items,puesto,jornada,años,numero);
            pila.add(ofrecer2);
            cola.add(ofrecer2);


            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("La informacion ha sido ingresada correctamente");
            alert.show();

            cmbPuesto.getSelectionModel().clearSelection();
            cmbJornada.getSelectionModel().clearSelection();
            cmbAños.getSelectionModel().clearSelection();
            txtNum.setText("");


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

}
