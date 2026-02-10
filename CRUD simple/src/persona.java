import java.util.Scanner;

class Persona {
    int id;
    String nombre;
    boolean activa;

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.activa = true; // Por defecto entra como activa
    }
}