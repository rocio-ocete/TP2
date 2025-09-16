import java.util.Scanner;

public class PrecioFinalProducto {
    
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double impuestoDecimal = impuesto / 100;
        double descuentoDecimal = descuento / 100;

        return precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Ingrese el precio base del producto: ");
            double precioBase = input.nextDouble();
            
            System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
            double impuesto = input.nextDouble();
            
            System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
            double descuento = input.nextDouble();
            
            double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
            
            System.out.println("El precio final del producto es: " + precioFinal);
        }
    }
}
