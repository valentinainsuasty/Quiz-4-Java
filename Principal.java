import java.util.Date;

/**
 *clase Principal
 */
public class Principal {
    /**
     * Método inicial que es ejecutado
     * @param args
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public static void main(String[] args) {
        Estudiante estudiante  = new Estudiante("Valentina", new Date(106, 2, 11));
        // Mostrar la edad del estudiante
        int edad = estudiante.getEdad(new Date(106,2,11));
        System.out.println("La edad de " + estudiante.getNombre() + " es " + edad + " años.");

        // Mostrar el promedio de notas del estudiante
        double promedio = estudiante.getPromedio(5.0, 4.0, 5.0);
        System.out.println("El promedio de notas es " + promedio);
    }
    }


