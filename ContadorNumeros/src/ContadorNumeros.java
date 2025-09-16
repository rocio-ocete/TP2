import java.util.Scanner;

public class ContadorNumeros {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int positivos = 0;
            int negativos = 0;
            int ceros = 0;
            
            for (int i = 1; i <= 10; i++) {
                System.out.print("Ingrese el numero " + i + ": ");
                int numero = input.nextInt();
                
                if (numero > 0) {
                    positivos++;
                } else if (numero < 0) {
                    negativos++;
                } else {
                    ceros++;
                }
            }
            
            System.out.println("Resultados:");
            System.out.println("Positivos: " + positivos);
            System.out.println("Negativos: " + negativos);
            System.out.println("Ceros: " + ceros);
        }
    }
}
