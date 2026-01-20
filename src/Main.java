import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Calcular IMC");
        System.out.println("2. Area de rectangulo");
        System.out.println("3. Area de circulo");
        System.out.println("4. Celsius a Fahrenheit");
        System.out.println("5. Salir");
        System.out.print("Opcion: ");
        int op = sc.nextInt();

        if (op == 1) {
            System.out.print("Peso: ");
            double p = sc.nextDouble();
            System.out.print("Altura: ");
            double a = sc.nextDouble();
            System.out.println("IMC: " + calcularIMC(p, a));
        }

        if (op == 2) {
            System.out.print("Base: ");
            double b = sc.nextDouble();
            System.out.print("Altura: ");
            double h = sc.nextDouble();
            System.out.println("Area: " + areaRectangulo(b, h));
        }

        if (op == 3) {
            System.out.print("Radio: ");
            double r = sc.nextDouble();
            System.out.println("Area: " + areaCirculo(r));
        }

        if (op == 4) {
            System.out.print("Celsius: ");
            double c = sc.nextDouble();
            System.out.println("Fahrenheit: " + celsiusAFahrenheit(c));
        }

        if (op == 5) {
            salir();
        }
    }

    /**
     * Calcula el Índice de Masa Corporal (IMC).
     * Divide el peso entre la altura al cuadrado.
     *
     * @param peso peso en kilogramos
     * @param altura altura en metros
     * @return valor del IMC
     */
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    /**
     * Calcula el área de un rectángulo.
     * Multiplica la base por la altura.
     *
     * @param base base del rectángulo
     * @param altura altura del rectángulo
     * @return área del rectángulo
     */
    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    /**
     * Calcula el área de un círculo.
     * Usa pi por el radio al cuadrado.
     *
     * @param radio radio del círculo
     * @return área del círculo
     */
    public static double areaCirculo(double radio) {
        return 3.1416 * radio * radio;
    }

    /**
     * Convierte grados Celsius a Fahrenheit.
     * Aplica la fórmula de conversión.
     *
     * @param celsius temperatura en grados Celsius
     * @return temperatura en grados Fahrenheit
     */
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Muestra un mensaje de salida.
     * Finaliza el programa.
     */
    public static void salir() {
        System.out.println("Saliendo del programa...");
    }
}
