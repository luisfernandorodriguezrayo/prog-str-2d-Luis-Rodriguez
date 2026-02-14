import java.util.Scanner;

public class Main {

    static Alumno[] alumnos = new Alumno[25];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int op;

        do {
            System.out.println("1.-Alta Alumno");
            System.out.println("2.- Buscar ID");
            System.out.println("3.- Actualizar promedio");
            System.out.println("4.- Baja logica ID");
            System.out.println("5.- Listar activos");
            System.out.println("6.- Reportes");
            System.out.println("0.- Salir");
            op = sc.nextInt();

            switch (op) {
                case 1: alta(); break;
                case 2: buscar(); break;
                case 3: actualizar(); break;
                case 4: baja(); break;
                case 5: listar(); break;
                case 6: reportes(); break;
            }

        } while (op != 0);
    }

    static void alta() {

        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (id <= 0 || existe(id)) {
            System.out.println("ID inválido");
            return;
        }

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        if (nombre.isEmpty()) {
            System.out.println("Nombre vacío");
            return;
        }

        System.out.print("Promedio: ");
        double promedio = sc.nextDouble();
        if (promedio < 0 || promedio > 10) {
            System.out.println("Promedio inválido");
            return;
        }

        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] == null) {
                alumnos[i] = new Alumno(id, nombre, promedio);
                System.out.println("Registrado");
                return;
            }
        }

        System.out.println("Lleno");
    }

    static void buscar() {
        System.out.print("ID: ");
        int id = sc.nextInt();

        for (Alumno a : alumnos) {
            if (a != null && a.id == id && a.activo) {
                System.out.println(a.id + " " + a.nombre + " " + a.promedio);
                return;
            }
        }
        System.out.println("No encontrado");
    }

    static void actualizar() {
        System.out.print("ID: ");
        int id = sc.nextInt();

        for (Alumno a : alumnos) {
            if (a != null && a.id == id && a.activo) {

                System.out.print("Nuevo promedio: ");
                double p = sc.nextDouble();

                if (p >= 0 && p <= 10) {
                    a.promedio = p;
                    System.out.println("Actualizado");
                } else {
                    System.out.println("Inválido");
                }
                return;
            }
        }
        System.out.println("No encontrado");
    }

    static void baja() {
        System.out.print("ID: ");
        int id = sc.nextInt();

        for (Alumno a : alumnos) {
            if (a != null && a.id == id && a.activo) {
                a.activo = false;
                System.out.println("Baja realizada");
                return;
            }
        }
        System.out.println("No encontrado");
    }

    static void listar() {
        for (Alumno a : alumnos) {
            if (a != null && a.activo) {
                System.out.println(a.id + " " + a.nombre + " " + a.promedio);
            }
        }
    }

    static void reportes() {

        double suma = 0;
        int cont = 0;
        Alumno mayor = null;
        Alumno menor = null;
        int arriba8 = 0;

        for (Alumno a : alumnos) {
            if (a != null && a.activo) {

                suma += a.promedio;
                cont++;

                if (mayor == null || a.promedio > mayor.promedio)
                    mayor = a;

                if (menor == null || a.promedio < menor.promedio)
                    menor = a;

                if (a.promedio >= 8)
                    arriba8++;
            }
        }

        if (cont == 0) {
            System.out.println("Sin activos");
            return;
        }

        System.out.println("Promedio general: " + (suma / cont));
        System.out.println("Mayor: " + mayor.id + " " + mayor.nombre + " " + mayor.promedio);
        System.out.println("Menor: " + menor.id + " " + menor.nombre + " " + menor.promedio);
        System.out.println(">=8: " + arriba8);
    }

    static boolean existe(int id) {
        for (Alumno a : alumnos) {
            if (a != null && a.id == id)
                return true;
        }
        return false;
    }
}

