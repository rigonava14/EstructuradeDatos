package sample;

public class Buscar2 {
    String[][]datos;
    private String Nombre;
    private String Puesto;
    private String Jornada;
    private String Años;
    private String Numero;

    public Buscar2(String[][] datos, String nombre, String puesto, String jornada, String años, String numero) {
        this.datos = datos;
        Nombre = nombre;
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

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
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
