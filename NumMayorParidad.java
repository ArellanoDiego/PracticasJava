import java.util.Scanner;

class NumMayorParidad{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce 3 numeros ");

        int entradaUsuario1 = entrada.nextInt();
        int entradaUsuario2 = entrada.nextInt();
        int entradaUsuario3 = entrada.nextInt();

        int mayor = (entradaUsuario1 >= entradaUsuario2 && entradaUsuario1 >= entradaUsuario3) ? entradaUsuario1 : 
                    (entradaUsuario2 >= entradaUsuario1 && entradaUsuario2 >= entradaUsuario3) ? entradaUsuario2 : entradaUsuario3;
        
        String paridad = (mayor % 2 == 0) ? " es par" : " es impar";
        

        System.out.println(mayor + paridad);
        entrada.close();
    }
}