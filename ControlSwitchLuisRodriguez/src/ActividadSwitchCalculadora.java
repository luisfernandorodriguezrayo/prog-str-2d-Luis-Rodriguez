import java.util.Scanner;

public class ActividadSwitchCalculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una opción:");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");

        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        System.out.print("Ingrese a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese b: ");
        double b = scanner.nextDouble();

        System.out.println("Valores ingresados: a = " + a + ", b = " + b);

        switch (opcion) {
            case 1:
                System.out.println("Operación: Suma");
                System.out.println("Resultado: " + (a + b));
                break;

            case 2:
                System.out.println("Operación: Resta");
                System.out.println("Resultado: " + (a - b));
                break;

            case 3:
                System.out.println("Operación: Multiplicación");
                System.out.println("Resultado: " + (a * b));
                break;

            case 4:
                System.out.println("Operación: División");
                if (b == 0) {
                    System.out.println("No se puede dividir entre cero");
                } else {
                    System.out.println("Resultado: " + (a / b));
                }
                break;

            default:
                System.out.println("Opción inválida");
                break;
        }

        scanner.close();
    }
}