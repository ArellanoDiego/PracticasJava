import java.util.Scanner;

class EvaluacionNotas{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nota para saber en que categoria de rendimiento estas");   
        int notaUsuario;
        notaUsuario = entrada.nextInt();

        String rendimientoUsuario = (notaUsuario >= 90 ) ? "Excelente" : 
                                    (notaUsuario >= 80 ) ? "Bueno" : 
                                    (notaUsuario >= 70 ) ? "Suficiente" : "Insuficiente"; 
                                    

        System.out.println("Tu nota es " + rendimientoUsuario);
        
        entrada.close();
    }
}