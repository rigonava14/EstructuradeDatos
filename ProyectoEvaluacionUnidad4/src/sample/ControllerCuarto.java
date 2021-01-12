package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.LinkedList;
import java.util.Queue;

public class ControllerCuarto {
    @FXML TableView tabla1,tabla2;

    TableColumn columnNombre= new TableColumn("NOMBRE");
    TableColumn columnPuesto= new TableColumn("PUESTO");
    TableColumn columnJornada= new TableColumn("JORNADA");
    TableColumn columnAños= new TableColumn("EXPERIENCIA");
    TableColumn columnNumero= new TableColumn("NUM CONTACTO");



    @FXML protected void initialize(){

        columnNombre.setCellValueFactory(new PropertyValueFactory<Buscar,String>("Nombre"));
        columnPuesto.setCellValueFactory(new PropertyValueFactory<Buscar,String>("Puesto"));
        columnJornada.setCellValueFactory(new PropertyValueFactory<Buscar,String>("Jornada"));
        columnAños.setCellValueFactory(new PropertyValueFactory<Buscar,String>("Años"));
        columnNumero.setCellValueFactory(new PropertyValueFactory<Buscar,String>("Numero"));

        tabla1.getColumns().addAll(columnNombre,columnPuesto,columnJornada,columnAños,columnNumero);
        tabla2.getColumns().addAll(columnPuesto,columnJornada,columnAños,columnNumero);
        tabla1.setItems(ControllerSegundo.listaBuscar);

    }

    public void  Mostrar(ActionEvent event) {

    }
}
