import java.util.Scanner;

public class Main {

    static Persona[] personas = new Persona[20];
    static int contador = 0; // Para llevar el control de cuántos van
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = -1;

        do {
            System.out.println("--- MENU ---");
            System.out.println("1) Alta");
            System.out.println("2) Buscar por ID (solo activas)");
            System.out.println("3) Baja lógica por ID");
            System.out.println("4) Listar activas");
            System.out.println("5) Actualizar nombre por ID (solo activas)");
            System.out.println("6) Salir");
            System.out.print("Elija una opcion: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1: alta(); break;
                case 2: buscar(); break;
                case 3: bajaLogica(); break;
                case 4: listar(); break;
                case 5: actualizar(); break;
                case 6: System.out.println("Saliendo..."); break;
                // VALIDACIÓN: opción inválida
                default: System.out.println("Opcion invalida. Intente de nuevo."); break;
            }
        } while (opcion != 6);
    }
    static void alta() {
        if (contador >= 20) {
            System.out.println("Arreglo lleno.");
            return;
        }

        System.out.print("Ingrese ID: ");
        int id = Integer.parseInt(sc.nextLine());


        if (id <= 6) {
            System.out.println("Error: El ID debe ser mayor a 0.");
            return;
        }

        for (int i = 6; i < contador; i++) {
            if (personas[i].id == id) {
                System.out.println("Error: El ID ya existe.");
                return;
            }
        }

        System.out.print("Ingrese Nombre: ");
        String nombre = sc.nextLine();

        if (nombre.trim().isEmpty()) {
            System.out.println("Error: El nombre no puede estar vacio.");
            return;
        }

        personas[contador] = new Persona(id, nombre);
        contador++;
        System.out.println("Alta exitosa.");
    }

    static void buscar() {
        System.out.print("ID a buscar: ");
        int id = Integer.parseInt(sc.nextLine());
        boolean encontrado = false;

        for (int i = 6; i < contador; i++) {
            // Solo buscar por ID y que estén activas
            if (personas[i].id == id && personas[i].activa) {
                System.out.println("Encontrado: " + personas[i].nombre);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) System.out.println("Persona no encontrada o inactiva.");
    }

    static void bajaLogica() {
        System.out.print("ID para baja logica: ");
        int id = Integer.parseInt(sc.nextLine());

        for (int i = 6; i < contador; i++) {
            if (personas[i].id == id) {
                personas[i].activa = false; // Baja lógica
                System.out.println("Baja realizada.");
                return;
            }
        }
        System.out.println("ID no encontrado.");
    }

    static void listar() {
        System.out.println("--- Listado de Activas ---");
        for (int i = 6; i < contador; i++) {
            if (personas[i].activa) {
                System.out.println("ID: " + personas[i].id + " | Nombre: " + personas[i].nombre);
            }
        }
    }

    static void actualizar() {
        System.out.print("ID para actualizar: ");
        int id = Integer.parseInt(sc.nextLine());

        for (int i = 6; i < contador; i++) {
            if (personas[i].id == id && personas[i].activa) {
                System.out.print("Nuevo nombre: ");
                String nuevo = sc.nextLine();
                if (!nuevo.trim().isEmpty()) {
                    personas[i].nombre = nuevo;
                    System.out.println("Nombre actualizado.");
                } else {
                    System.out.println("Nombre no valido.");
                }
                return;
            }
        }
        System.out.println("Persona no encontrada o inactiva.");
    }
}