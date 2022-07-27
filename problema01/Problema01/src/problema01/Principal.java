/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author UsuarioITC
 */
public class Principal {

    public static void main(String[] args) {
        Enlace e = new Enlace();
        Scanner entrada = new Scanner(System.in);
        double bandera;
        do {

            System.out.println("Ingrese la cedula del trabajador: ");
            String ce = entrada.nextLine();
            System.out.println("Ingrese el nombre del trabajador: ");
            String n = entrada.nextLine();
            System.out.println("Ingrese el correo del trabajador: ");
            String co = entrada.nextLine();
            System.out.println("Ingrese el sueldo del trabajador: ");
            double s = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese el mes del sueldo del trabajador:");
            String m = entrada.nextLine();

            Sueldos trabajador = new Sueldos(ce, n, co,
                    s, m);
            e.insertarTrabajador(trabajador);
            System.out.println("Ingrese 0 para ingresar otro trabajador: ");
            bandera = entrada.nextDouble();
            entrada.nextLine();
        } while (bandera != 0);
    }

}
