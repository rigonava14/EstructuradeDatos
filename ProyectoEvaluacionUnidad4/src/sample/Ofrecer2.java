package sample;

public class Ofrecer2 {
    String[][] datos;
    private String Puesto;
    private String Jornada;
    private String Años;
    private String Numero;

    public Ofrecer2(String[][] datos, String puesto, String jornada, String años, String numero) {
        this.datos = datos;
        Puesto = puesto;
        Jornada = jornada;
        Años = años;
        Numero = numero;
    }

    public String[][] getDatos() {
        return datos;
    }

    public void setDatos(String[][] datos) {
        this.datos = datos;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String puesto) {
        Puesto = puesto;
    }

    public String getJornada() {
        return Jornada;
    }

    public void setJornada(String jornada) {
        Jornada = jornada;
    }

    public String getAños() {
        return Años;
    }

    public void setAños(String años) {
        Años = años;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }
}

