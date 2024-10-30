import java.util.Scanner;

class Calificacion{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la calificación del estudiante para saber si reprobo o aprobo");
        int calificación;
        calificación = scanner.nextInt();

        String resultado = (calificación >= 60 ? "Aprobado" : "Reprobado");

        System.out.println(resultado);
        
        scanner.close();
    }
}



