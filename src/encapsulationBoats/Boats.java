package encapsulationBoats;

import javax.swing.JOptionPane;

public class Boats {
    // Atributos
    private int codigo;
    private String nombre;
    private String marca;
    private String accion;
    private String tipo;
    private int modelo;

    // Constructores
    public Boats() {
    }

    public Boats(String nombre, String marca, int modelo, String accion, String tipo) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.accion = accion;
        this.tipo = tipo;
    }

    // Getters y setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    // Método para ingresar los datos del barco
    public void ingresar() {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del barco");
        marca = JOptionPane.showInputDialog("Ingrese la marca del barco");
        modelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo del barco"));
        accion = JOptionPane.showInputDialog("Ingrese la acción que hace el barco");
        tipo = JOptionPane.showInputDialog("Ingrese el tipo de barco");
    }

    // Método para mostrar la información del barco
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Acción: " + accion);
        System.out.println("Tipo: " + tipo);
    }
}
