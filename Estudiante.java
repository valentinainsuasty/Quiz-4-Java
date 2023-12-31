import java.util.Date;

/**
 * clase Estudiante
 */
public class Estudiante {
    private String nombre;
    private Date fechaDeNacimiento;
    private double notaMateria1;
    private double notaMateria2;
    private double notaMateria3;
/**
 * CONSTRUCTORES
 */
/**
 * Metodo constructor para inicializar los atributos de la clase
 * @param fechaDeNacimiento fecha de nacimiento del estudiante
 *
 * Complejidad temporal: 0(1) tiempo constante
 */
    public Estudiante(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    /**
     * Metodo que permite obtener la edad del estudiante
     * @return Edad del estudiante
     *
     * Complejidad temporal: 0(N) Tiempo Lineal
     */
    public int getEdad(Date fechaDeNacimiento){
            Date fechaActual = new Date();
            int edad = fechaActual.getYear() - fechaDeNacimiento.getYear();
            if (fechaActual.getMonth() < fechaDeNacimiento.getMonth() ||
                    (fechaActual.getMonth() == fechaDeNacimiento.getMonth() &&
                            fechaActual.getDay() < fechaDeNacimiento.getDay())) {
                edad--;
            }
            return edad;
    }
    /**
     * Método que permite obtener el promedio de las notas del estudiante
     * @return Promedio de las notas del estudiante
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public double getPromedio(double notaMateria1, double notaMateria2, double notaMateria3){
        return(notaMateria1 + notaMateria2 + notaMateria3) / 3.0;
    }
    /**
     * Método que permite consultar el nombre del estudiante
     * @return Nombre del estudiante
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String getNombre() {return nombre;}
    /**
     * Método que permite consultar la fecha de nacimiento del estudiante
     * @return Fecha de nacimiento
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public Date getFechaDeNacimiento() {return fechaDeNacimiento;}
    /**
     * Método que permite consultar la nota de la primera materia
     * @return Nota de la priemra materia
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public double getNotaMateria1() {return notaMateria1;}
    /**
     * Método que permite consultar la nota de la segunda materia
     * @return Nota de la segunda materia
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public double getNotaMateria2() {return notaMateria2;}
    /**
     * Método que permite consultar la nota de la tercera materia
     * @return Nota de la tercera materia
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public double getNotaMateria3() {return notaMateria3;}
    /**
     * Método que permite cambiar la nota de la primera materia
     * @return Nota de la priemra materia
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void setNotaMateria1(double notaMateria1) {
        this.notaMateria1 = notaMateria1;
    }
    /**
     * Método que permite cambiar la nota de la segunda materia
     * @return Nota de la segunda materia
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void setNotaMateria2(double notaMateria2) {
        this.notaMateria2 = notaMateria2;
    }
    /**
     * Método que permite cambiar la nota de la tercera materia
     * @return Nota de la tercera materia
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void setNotaMateria3(double notaMateria3) {
        this.notaMateria3 = notaMateria3;
    }
}
