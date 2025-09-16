import java.util.Scanner;

public class AnioBisiesto {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Ingrese un anio: ");
            int anio = input.nextInt();
            
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                System.out.println("El anio " + anio + " es bisiesto.");
            } else {
                System.out.println("El anio " + anio + " no es bisiesto.");
            }
        }
    }
}
