package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class ControllerCuarto {
    @FXML TableView tabla1,tabla2;

    TableColumn columnNombre= new TableColumn("NOMBRE");
    TableColumn columnPuesto= new TableColumn("PUESTO");
    TableColumn columnJornada= new TableColumn("JORNADA");
    TableColumn columnAños= new TableColumn("EXPERIENCIA");
    TableColumn columnNumero= new TableColumn("NUM CONTACTO");

    TableColumn cPuesto= new TableColumn("PUESTO");
    TableColumn cJornada= new TableColumn("JORNADA");
    TableColumn cAños= new TableColumn("EXPERIENCIA");
    TableColumn cNumero= new TableColumn("NUM CONTACTO");

    @FXML protected void initialize(){

        columnNombre.setCellValueFactory(new PropertyValueFactory<Buscar,String>("Nombre"));
        columnPuesto.setCellValueFactory(new PropertyValueFactory<Buscar,String>("Puesto"));
        columnJornada.setCellValueFactory(new PropertyValueFactory<Buscar,String>("Jornada"));
        columnAños.setCellValueFactory(new PropertyValueFactory<Buscar,String>("Años"));
        columnNumero.setCellValueFactory(new PropertyValueFactory<Buscar,String>("Numero"));

        tabla1.getColumns().addAll(columnNombre,columnPuesto,columnJornada,columnAños,columnNumero);
        tabla1.setItems(ControllerSegundo.listaBuscar);

        cPuesto.setCellValueFactory(new PropertyValueFactory<Ofrecer,String>("Puesto"));
        cJornada.setCellValueFactory(new PropertyValueFactory<Ofrecer,String>("Jornada"));
        cAños.setCellValueFactory(new PropertyValueFactory<Ofrecer,String>("Años"));
        cNumero.setCellValueFactory(new PropertyValueFactory<Ofrecer,String>("Numero"));

        tabla2.getColumns().addAll(cPuesto,cJornada,cAños,cNumero);
        tabla2.setItems(ControllerTercero.ListaOfrecer);

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

    public void  Mostrar(ActionEvent event) {
        Buscar2 buscar= ControllerSegundo.pila.peek();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("El elemento mas reciente es:");
        alert.setContentText(" Nombre: "+buscar.getNombre()+"\n Puesto : "+buscar.getPuesto()+"\n Jornada : "+buscar.getJornada()+"\n Años de experiencia : "+buscar.getAños()+"\n Num. Contacto : "+buscar.getNumero());
        alert.show();

    }
    public void Antiguo(){
        Buscar2 buscar= ControllerSegundo.cola.peek();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("El elemento mas antiguo es:");
        alert.setContentText(" Nombre: "+buscar.getNombre()+"\n Puesto : "+buscar.getPuesto()+"\n Jornada : "+buscar.getJornada()+"\n Años de experiencia : "+buscar.getAños()+"\n Num. Contacto : "+buscar.getNumero());
        alert.show();
    }
    public void  Reciente(ActionEvent event) {
        Ofrecer2 buscar= ControllerTercero.pila.peek();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("El elemento mas reciente es:");
        alert.setContentText(" Puesto :"+buscar.getPuesto()+"\n Jornada : "+buscar.getJornada()+"\n Años de experiencia : "+buscar.getAños()+"\n Num. Contacto : "+buscar.getNumero());
        alert.show();

    }
    public void Antiguo2(){
        Ofrecer2 buscar= ControllerTercero.cola.peek();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("El elemento mas antiguo es:");
        alert.setContentText(" Puesto :"+buscar.getPuesto()+"\n Jornada : "+buscar.getJornada()+"\n Años de experiencia : "+buscar.getAños()+"\n Num. Contacto : "+buscar.getNumero());
        alert.show();
    }



}//llave class

