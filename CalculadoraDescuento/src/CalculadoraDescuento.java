import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = input.nextDouble();

        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        char categoria = input.next().toUpperCase().charAt(0);

        double descuento = 0;

        switch (categoria) {
            case 'A' -> descuento = 0.10;
            case 'B' -> descuento = 0.15;
            case 'C' -> descuento = 0.20;
            default -> {
                System.out.println("Categoria no válida. Debe ser A, B o C.");
                return;
            }
        }

        double montoDescuento = precioOriginal * descuento;
        double precioFinal = precioOriginal - montoDescuento;

        System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }
}
