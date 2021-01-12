package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

public class Buscar {
    SimpleStringProperty Nombre;
    SimpleStringProperty Puesto;
    SimpleStringProperty Jornada;
    SimpleStringProperty Años;
    SimpleStringProperty Numero;

    public Buscar(String Nombre, String Puesto, String Jornada, String Años, String Numero){
        this.Nombre = new SimpleStringProperty(Nombre);
        this.Puesto = new SimpleStringProperty(Puesto);
        this.Jornada = new SimpleStringProperty(Jornada);
        this.Años = new SimpleStringProperty(Años);
        this.Numero = new SimpleStringProperty(Numero);
    }

    public Buscar(ObservableList<Buscar> listaBuscar) {
    }

    public String getNombre() {
        return Nombre.get();
    }

    public SimpleStringProperty nombreProperty() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre.set(nombre);
    }

    public String getPuesto() {
        return Puesto.get();
    }

    public SimpleStringProperty puestoProperty() {
        return Puesto;
    }

    public void setPuesto(String puesto) {
        this.Puesto.set(puesto);
    }

    public String getJornada() {
        return Jornada.get();
    }

    public SimpleStringProperty jornadaProperty() {
        return Jornada;
    }

    public void setJornada(String jornada) {
        this.Jornada.set(jornada);
    }

    public String getAños() {
        return Años.get();
    }

    public SimpleStringProperty añosProperty() {
        return Años;
    }

    public void setAños(String años) {
        this.Años.set(años);
    }

    public String getNumero() {
        return Numero.get();
    }

    public SimpleStringProperty numeroProperty() {
        return Numero;
    }

    public void setNumero(String numero) {
        this.Numero.set(numero);
    }
}
