import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc;

        do {
            System.out.println(" MENÚ DE OPERACIONES ");
            System.out.println("1. Calcular IMC");
            System.out.println("2. Calcular área de un rectángulo");
            System.out.println("3. Convertir °C a °F");
            System.out.println("4. Calcular área de un círculo");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opc = scanner.nextInt();

            if (opc == 1) {
                System.out.print("Ingresa tu peso en kg: ");
                double peso = scanner.nextDouble();
                System.out.print("Ingresa tu altura en metros (ej. 1.75): ");
                double altura = scanner.nextDouble();

                double imc = calcularIMC(peso, altura);
                System.out.println(">> Tu IMC es: " + imc);

            } else if (opc == 2) {
                System.out.print("Ingresa la base: ");
                double base = scanner.nextDouble();
                System.out.print("Ingresa la altura: ");
                double alturaRect = scanner.nextDouble();

                double areaRect = calcularAreaRectangulo(base, alturaRect);
                System.out.println(">> El área del rectángulo es: " + areaRect);

            } else if (opc == 3) {
                System.out.print("Ingresa los grados Celsius: ");
                double celsius = scanner.nextDouble();

                double fahrenheit = convertirCelsiusAFahrenheit(celsius);
                System.out.println(">> " + celsius + "°C equivalen a " + fahrenheit + "°F");

            } else if (opc == 4) {
                System.out.print("Ingresa el radio del círculo: ");
                double radio = scanner.nextDouble();

                // Cálculo manual sin Math
                double areaCirc = calcularAreaCirculo(radio);
                System.out.println(">> El área del círculo es: " + areaCirc);

            } else if (opc == 5) {
                System.out.println("Saliendo del programa... ¡Adiós!");

            } else {
                System.out.println("Opción no válida. Por favor intenta de nuevo.");
            }

        } while (opc != 5);

        scanner.close();
    }


    /**
     * Calcula el Índice de Masa Corporal (IMC) de una persona.
     * @param peso Peso en kilogramos.
     * @param altura Altura en metros.
     * @return El valor del IMC calculado.
     */
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    /**
     * Calcula el área de un rectángulo multiplicando base por altura.
     * @param base La base del rectángulo.
     * @param altura La altura del rectángulo.
     * @return El área total del rectángulo.
     */
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    /**
     * Convierte una temperatura de grados Celsius a grados Fahrenheit.
     * Fórmula: (C * 1.8) + 32
     * @param celsius Temperatura en grados Celsius.
     * @return Temperatura convertida a grados Fahrenheit.
     */
    public static double convertirCelsiusAFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    /**
     * Calcula el área de un círculo de forma manual.
     * Fórmula: PI * radio * radio (Usando PI = 3.1416)
     * @param radio El radio del círculo.
     * @return El área calculada del círculo.
     */
    public static double calcularAreaCirculo(double radio) {
        double pi = 3.1416;
        return pi * radio * radio;
    }
}