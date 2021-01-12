package sample;

import javafx.beans.property.SimpleStringProperty;

public class Ofrecer {
    SimpleStringProperty Puesto;
    SimpleStringProperty Jornada;
    SimpleStringProperty Años;
    SimpleStringProperty Numero;
    public Ofrecer(String  Puesto, String Jornada, String Años, String Numero){
        this.Puesto = new SimpleStringProperty(Puesto);
        this.Jornada = new SimpleStringProperty(Jornada);
        this.Años = new SimpleStringProperty(Años);
        this.Numero = new SimpleStringProperty(Numero);
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
