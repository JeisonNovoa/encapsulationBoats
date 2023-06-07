package encapsulationBoats;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, Boats> mapaBarcos = new HashMap<>();

        int codigo = 1;
        int respuesta;

        do {
            Boats barco = new Boats();
            barco.ingresar();
            barco.setCodigo(codigo);
            mapaBarcos.put(codigo, barco);
            codigo++;

            respuesta = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro barco?", "Confirmación",
                    JOptionPane.YES_NO_OPTION);
        } while (respuesta == JOptionPane.YES_OPTION);

        int opcion;
        String mensaje;

        do {
            mensaje = "MENÚ DE BÚSQUEDA\n";
            mensaje += "1. Consultar barco\n";
            mensaje += "2. Consultar lista de barcos\n";
            mensaje += "3. Salir\n";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));

            switch (opcion) {
                case 1:
                    int codigoBarco = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del barco"));
                    Boats barco = mapaBarcos.get(codigoBarco);
                    if (barco != null) {
                        System.out.println("Información del barco:");
                        barco.mostrarInformacion();
                    } else {
                        System.out.println("Barco no encontrado.");
                    }
                    break;
                case 2:
                    System.out.println("Lista de barcos:");
                    for (Boats b : mapaBarcos.values()) {
                        b.mostrarInformacion();
                    }
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 3);
    }
}