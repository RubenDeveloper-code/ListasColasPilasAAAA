import java.util.Stack;

class PilaProductos {
    private Stack<Producto> pilaProductos;

    PilaProductos() {
        pilaProductos = new Stack<Producto>();
    }

    public String push(Producto producto) {
        pilaProductos.push(producto);
        return "Producto agregado";
    }

    public Producto pop() {
        return pilaProductos.pop();
    }

    //ImprimirPila
    public String contenidoPila() {
        String res = "";
        for (Producto producto : pilaProductos) {
            res+=producto.toString();
        }
        return res;
    }

    //ImprimirPilaInversa
    public String contenidoPilaInverso() {
        String res = "";
        for(int i = pilaProductos.size()-1; i >= 0; i--) {
            res+=pilaProductos.get(i).toString();
        }
        return res;
    }
}
