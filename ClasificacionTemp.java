import java.util.Scanner;

class ClasificacionTemp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una temperatura para clasificar ");
        int tempUsuario = entrada.nextInt();

        String categoriaTemp = (tempUsuario < 0 ) ? "Congelante" : 
                            (tempUsuario <= 15 ) ? "Fría" : 
                            (tempUsuario <= 25 ) ? "Templada" : 
                            (tempUsuario <= 35 ) ? "Caliente" : "Muy Caliente" ; 
        
                      
        System.out.println("La temperatura es: " + categoriaTemp);

        
        entrada.close();
    }
}