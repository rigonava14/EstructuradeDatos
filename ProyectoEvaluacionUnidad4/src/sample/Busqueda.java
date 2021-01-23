package sample;

public class Busqueda {
    public int secuencial(String[][] array,String dato1,String dato2){
        int indice=-1;
        for (int x=0;x<array.length;x++){
            if(array[x][1].equals(dato1) && array[x][2].equals(dato2)){
                indice=x;
                return indice;
            }
        }
        return indice;
    }
    public  int binaria(String[][] array, int dato1){
        int indice=0;
        int num_buscado= dato1;
        int inferior=0;
        int centro;
        int superior=2;
        while (inferior<=superior){
            centro=(superior+inferior)/2;
            if (Integer.parseInt(array[centro][0])==num_buscado){
                indice=num_buscado;
                return indice;
            }else if (num_buscado<Integer.parseInt(array[centro][0])){
                superior=centro-1;
            }else {
                inferior=centro+1;
            }

        }
        return indice;
    }
}
