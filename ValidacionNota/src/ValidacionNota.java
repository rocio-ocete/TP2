import java.util.Scanner;

public class ValidacionNota {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int nota;
            
            do {
                System.out.print("Ingrese una nota (0-10): ");
                nota = input.nextInt();
                
                if (nota < 0 || nota > 10) {
                    System.out.println("Error: Nota invalida. Ingrese una nota entre 0 y 10.");
                }
                
            } while (nota < 0 || nota > 10);
            
            System.out.println("Nota guardada correctamente.");
        }
    }
}
