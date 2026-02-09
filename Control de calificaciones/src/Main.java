import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeService servicio = new GradeService();

        String nombre = leerTexto(sc, "Ingrese el nombre: ");
        double p1 = leerDouble(sc, "Ingrese la calificación del parcial 1 (0-100): ");
        double p2 = leerDouble(sc, "Ingrese la calificación del parcial 2 (0-100): ");
        double p3 = leerDouble(sc, "Ingrese la calificación del parcial 3 (0-100): ");
        int asistencia = leerInt(sc, "Asistencia (0-100): ");
        boolean proyecto = leerBoolean(sc, "¿Entregó proyecto? (si/no): ");

        double promedio = servicio.calcularPromedio(p1, p2, p3);
        double calificacionFinal = servicio.calcularFinal(promedio, asistencia);
        String estado = servicio.determinarEstado(calificacionFinal, asistencia, proyecto);

        imprimirReporte(nombre, p1, p2, p3, promedio, asistencia, proyecto, calificacionFinal, estado);

        sc.close();
    }

    public static String leerTexto(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.next();
    }

    public static double leerDouble(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    public static int leerInt(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.nextInt();
    }

    // ✅ MÉTODO CORREGIDO
    public static boolean leerBoolean(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        String respuesta = sc.next().toLowerCase();
        return respuesta.equals("si");
    }

    public static void imprimirReporte(String nombre, double p1, double p2, double p3,
                                       double promedio, int asistencia,
                                       boolean proyecto, double finalNota, String estado) {

        System.out.println("\nREPORTE");
        System.out.println("Nombre del alumno: " + nombre);
        System.out.println("Calificaciones: " + p1 + ", " + p2 + ", " + p3);
        System.out.println("Promedio: " + promedio);
        System.out.println("Asistencia: " + asistencia + "%");
        System.out.println("Proyecto: " + (proyecto ? "Sí" : "No"));
        System.out.println("Calificación final: " + finalNota);
        System.out.println("Estado: " + estado);
    }
}
