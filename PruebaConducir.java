import java.util.Scanner;

class PruebaConducir {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dime tu edad para saber si puedes conducir o no");

        int edadUsuario;
        edadUsuario = entrada.nextInt();

        String resultado = (edadUsuario >= 18 ? "Puedes conducir" : "No puedes conducir") ;

        System.out.println(resultado);

        entrada.close();
    }
}