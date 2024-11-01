import java.util.Scanner;

class DescuentoEdadClase{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu edad ");
        int edadUsuario = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Introduce tu tipo de cliente ");
        String tipoCliente = entrada.nextLine();

        String descuentos = (edadUsuario < 18 ) ?
                                (tipoCliente.equals("estudiante") ? "20% de descuento" : 
                                tipoCliente.equals ("regular") ? "10% de descuento" : "25% de descuento") :
                            (edadUsuario <= 60) ? 
                                (tipoCliente.equals("estudiante") ? "15% de descuento" : 
                                tipoCliente.equals("regular") ? "5% de descuento" : "20% de descuento") : 
                                (tipoCliente.equals("estudiante") ? "30% de descuento" : 
                                tipoCliente.equals ("regular") ? "20% de descuento" : "40% de descuento");
        
        System.out.println("Tu tipo de descuento es " + descuentos);
                             
        entrada.close();
    }
}