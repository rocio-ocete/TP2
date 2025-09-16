import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Ingrese el primer numero: ");
            int num1 = input.nextInt();
            
            System.out.print("Ingrese el segundo numero: ");
            int num2 = input.nextInt();
            
            System.out.print("Ingrese el tercer numero: ");
            int num3 = input.nextInt();
            
            int mayor = num1;
            
            if (num2 > mayor) {
                mayor = num2;
            }
            if (num3 > mayor) {
                mayor = num3;
            }
            
            System.out.println("El mayor es: " + mayor);
        }
    }
}
