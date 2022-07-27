/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

/**
 *
 * @author UsuarioITC
 */
public class Sueldos {

    private String cedula, nombre, correo, mes;
    private double sueldo;

    public Sueldos(String c, String n, String co, double s, String m) {
        cedula = c;
        nombre = n;
        correo = co;
        sueldo = s;
        mes = m;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerCorreo(String c) {
        correo = c;
    }

    public void establecerSueldo(double c) {
        sueldo = c;
    }

    public void establecerMes(String c) {
        mes = c;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public String obtenerMes() {
        return mes;
    }

     @Override
    public String toString(){
        String data = String.format(
                "Numero de cedula: %s\n"
                + "Nombre: %s\n"
                + "Correo: %s\n"
                + "Sueldo: %.2f\n"
                + "Mes: %s\n",
                obtenerCedula(),
                obtenerNombre(), 
                obtenerCorreo(),
                obtenerSueldo(),
                obtenerMes());
        return data;
    }
}
