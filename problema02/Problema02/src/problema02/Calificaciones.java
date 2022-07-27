/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author UsuarioITC
 */
public class Calificaciones {

    private String nombre;
    private String apellido;
    private double n1, n2, n3, promedio;

    public Calificaciones(String n, String a,double c1, double c2, double c3) {
        nombre = n;
        apellido = a;
        n1 = c1;
        n2 = c2;
        n3 = c3;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerApellido(String c) {
        apellido = c;
    }

    public void establecerCalificacion1(double c) {
        n1 = c;
    }

    public void establecerCalificacion2(double c) {
        n2 = c;
    }

    public void establecerCalificacion3(double c) {
        n3 = c;
    }

    public void calcularPromedio() {
        promedio = (n1 + n2 + n3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerNota1() {
        return n1;
    }

    public double obtenerNota2() {
        return n2;
    }

    public double obtenerNota3() {
        return n3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s %s\n"
                + "  \tCalificaciones:\n"
                + "  \t%.2f\n"
                + "  \t%.2f\n"
                + "  \t%.2f\n"
                + "  \tPromedio: %.2f\n",
                nombre,
                apellido,
                n1,
                n2,
                n3,
                promedio);
        return cadena;

    }
}
