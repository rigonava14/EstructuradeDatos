public class Principal {
    public static void main(String[] args) {
        for(int x=0;x<3;x++){
            for(int y=0;y<2;y++){
                System.out.println("La Y"+ yea(y-1));
            }
            System.out.println("La X"+ yea(x-1));
        }
    }

    public static int yea(int n){
        if (n==1){
            System.out.println("NO");
            return n*1;
        }else {
            System.out.println("SI"+(n-1));
            return n*2;
        }
    }
}
