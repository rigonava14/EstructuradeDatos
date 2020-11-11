package Peces;

public class Pez {
    private String Tipo_Pez;
    private int Por_Nacimiento;
    String[] a;

    public Pez(String[] a) {
        this.a = a;
    }


    public String[] peces_por_anio(String[] arr){
        String[] retorno=a;
        for (int x=0; x<retorno.length;x++){
            System.out.print(retorno[x]+" ");
        }
        return retorno;
    }

    public Pez(String tipo_Pez, int por_Nacimiento) {
        Tipo_Pez = tipo_Pez;
        Por_Nacimiento = por_Nacimiento;
    }

    public String[] getA() {
        return a;
    }

    public void setA(String[] a) {
        this.a = a;
    }



    public String getTipo_Pez() {
        return Tipo_Pez;
    }

    public void setTipo_Pez(String tipo_Pez) {
        Tipo_Pez = tipo_Pez;
    }

    public int getPor_Nacimiento() {
        return Por_Nacimiento;
    }

    public void setPor_Nacimiento(int por_Nacimiento) {
        Por_Nacimiento = por_Nacimiento;
    }

}
