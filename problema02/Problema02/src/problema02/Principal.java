/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author UsuarioITC
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Enlace e = new Enlace();

        for (int i = 0; i < e.obtenerDataCalificaciones().size(); i++) {
            System.out.printf("%s\n", e.obtenerDataCalificaciones().get(i));
        }
    }

}
