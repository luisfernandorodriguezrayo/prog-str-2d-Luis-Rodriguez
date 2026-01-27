import java.util.Scanner;

public class ActividadIfElseTarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;
        boolean esEstudiante;
        int tarifa;
        String resp;

        System.out.print("Edad: ");
        edad = sc.nextInt();

        if (edad < 0 || edad > 120) {
            System.out.println("Edad inválida");
            return;
        }

        System.out.print("¿Es estudiante? (si/no): ");
        resp = sc.next();
        esEstudiante = resp.equalsIgnoreCase("si");

        if (edad < 12) {
            tarifa = 50;
        } else if (edad <= 17) {
            if (esEstudiante) {
                tarifa = 60;
            } else {
                tarifa = 80;
            }
        } else {
            if (esEstudiante) {
                tarifa = 90;
            } else {
                tarifa = 120;
            }
        }

        System.out.println("Edad ingresada: " + edad);
        System.out.println("Es Estudiante: " + esEstudiante);
        System.out.println("Tarifa final: $" + tarifa);
    }
}