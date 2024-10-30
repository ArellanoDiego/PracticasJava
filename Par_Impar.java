import java.util.Scanner;

class Par_Impar{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println(" Ingresa el numero y te dire si es par o impar ");
        int numeroUsuario;
        numeroUsuario = entrada.nextInt();
        
        String resultado = (numeroUsuario% 2 == 0) ? "par" : "impar";

        System.out.println("El numero es " + resultado);
        
        entrada.close();
    }
}