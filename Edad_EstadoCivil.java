import java.util.Scanner;

class Edad_EstadoCivil {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu edad ");
        int edadUsuario = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Introduce tu estado civil ");
        String estadoCivilUsuario = entrada.nextLine().toLowerCase();

        String usuarioEvaluacion = (edadUsuario < 18) ? "Menor de edad"
                : (edadUsuario <= 25) ? (estadoCivilUsuario.equals("soltero") ? "Joven Soltero" : "Joven Adulto")
                        : (edadUsuario <= 60) ? "Adulto"
                                : (estadoCivilUsuario.equals("casado") ? "Adulto mayor casado"
                                        : "Adulto mayor soltero");

        System.out.println("Clasificacion " + usuarioEvaluacion);

        entrada.close();
    }
}