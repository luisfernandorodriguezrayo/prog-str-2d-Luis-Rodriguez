public class ShippingCalculator {

    private static final double COSTO_SERVICIO_BASICO = 50;
    private static final double COSTO_SERVICIO_EXPRESS = 90;
    private static final double COSTO_POR_KG = 12;
    private static final double RECARGO_ZONA_REMOTA = 0.10;
    private static final double IVA = 0.16;

    public double calcularSubtotal(double pesoKg, int distanciaKm, int tipoServicio, boolean esZonaRemota) {
        double subtotal = obtenerCostoServicio(tipoServicio);
        subtotal += pesoKg * COSTO_POR_KG;
        subtotal += obtenerCostoDistancia(distanciaKm);

        if (esZonaRemota) {
            subtotal += subtotal * RECARGO_ZONA_REMOTA;
        }

        return subtotal;
    }

    private double obtenerCostoServicio(int tipoServicio) {
        return (tipoServicio == 1) ? COSTO_SERVICIO_BASICO : COSTO_SERVICIO_EXPRESS;
    }

    private double obtenerCostoDistancia(int distanciaKm) {
        if (distanciaKm <= 50) {
            return 20;
        } else if (distanciaKm <= 200) {
            return 60;
        } else {
            return 120;
        }
    }

    public double calcularIVA(double subtotal) {
        return subtotal * IVA;
    }

    public double calcularTotal(double subtotal) {
        return subtotal + calcularIVA(subtotal);
    }
}
