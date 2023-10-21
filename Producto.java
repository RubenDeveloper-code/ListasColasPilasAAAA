class Producto {
    String nombre;
    String fechaCaducidad;
    int numLote;
    double costoProducto;

    Producto(String nombre, String fechaCaducidad, int numLote, double costoProducto) {
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.numLote = numLote;
        this.costoProducto = costoProducto;
    }

    public double precioVenta() {
        return costoProducto;
    }

    @Override
    public String toString() {
        return nombre + ":" + numLote + " Caducidad: " + fechaCaducidad + " Costo: " + costoProducto;
    }
}
