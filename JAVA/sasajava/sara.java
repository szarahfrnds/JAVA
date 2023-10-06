public class sara {
    public static void main(String[] args) {
        System.out.println(fatorial(6));

    }
    public static int fatorial(int valor) {

            if (valor == 1){
                return 1;}
        else {while (valor != 1){
            valor = valor * (valor -1);
            valor--;
            }

        }return valor;
}
}

