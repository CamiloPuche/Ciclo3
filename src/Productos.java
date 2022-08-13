public class Productos {
    String productos;
    int Precio;

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public Productos(String productos, int Precio) {
        this.productos = productos;
        this.Precio = Precio;
        System.out.println("Hola Mundo");
    }
}
