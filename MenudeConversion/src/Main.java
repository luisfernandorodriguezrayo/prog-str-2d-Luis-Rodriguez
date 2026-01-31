import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;
        int cAF = 0, fAC = 0, kmAM = 0, mAK = 0;
        int total = 0;

        do {
            System.out.println("1) °C a °F");
            System.out.println("2) °F a °C");
            System.out.println("3) Km a Millas");
            System.out.println("4) Millas a Km");
            System.out.println("5) Salir");
            System.out.print("Opción: ");

            while (!sc.hasNextInt()) {
                System.out.print("Ingresa un número válido: ");
                sc.next();
            }

            opcion = sc.nextInt();

            if (opcion < 1 || opcion > 5) {
                System.out.println("Opción inválida.");
                continue;
            }

            if (opcion == 5) {
                break;
            }

            System.out.print("Ingresa el valor: ");
            while (!sc.hasNextDouble()) {
                System.out.print("Dato inválido, intenta de nuevo: ");
                sc.next();
            }

            double valor = sc.nextDouble();
            double resultado = 0;

            switch (opcion) {
                case 1:
                    resultado = (valor * 9 / 5) + 32;
                    cAF++;
                    break;

                case 2:
                    resultado = (valor - 32) * 5 / 9;
                    fAC++;
                    break;

                case 3:
                    resultado = valor * 0.621371;
                    kmAM++;
                    break;

                case 4:
                    resultado = valor / 0.621371;
                    mAK++;
                    break;
            }

            System.out.println("Resultado: " + resultado);
            total++;

        } while (true);

        System.out.println(" RESUMEN ");
        System.out.println("Total conversiones: " + total);
        System.out.println("°C a °F: " + cAF);
        System.out.println("°F a °C: " + fAC);
        System.out.println("Km a Millas: " + kmAM);
        System.out.println("Millas a Km: " + mAK);

        sc.close();
    }
}
