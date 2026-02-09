public class GradeService {

    private static final double PORCENTAJE_PROMEDIO = 0.7;
    private static final double PORCENTAJE_ASISTENCIA = 0.3;
    private static final double NOTA_MINIMA = 70;
    private static final int ASISTENCIA_MINIMA = 80;

    public double calcularPromedio(double p1, double p2, double p3) {
        double suma = p1 + p2 + p3;
        return suma / 3.0;
    }

    public double calcularFinal(double promedio, int asistencia) {
        double notaPromedio = promedio * PORCENTAJE_PROMEDIO;
        double notaAsistencia = asistencia * PORCENTAJE_ASISTENCIA;
        return notaPromedio + notaAsistencia;
    }

    public String determinarEstado(double notaFinal, int asistencia, boolean entregoProyecto) {

        if (asistencia < ASISTENCIA_MINIMA) {
            return "REPROBADO por asistencia";
        }

        if (!entregoProyecto) {
            return "REPROBADO por proyecto";
        }

        return (notaFinal >= NOTA_MINIMA)
                ? "APROBADO"
                : "REPROBADO por calificación";
    }
}
