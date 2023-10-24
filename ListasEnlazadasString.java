import java.util.LinkedList;

class ListasEnlazadasColores {
    LinkedList<String> listString;
    ListasEnlazadasColores() {
        listString = new LinkedList<String>();
    }

    public String insertarAlFinal(String color) {
        listString.addLast(color);
        return "String añadida al final de la lista";
    }

    public String insertarAlPrincipio(String color) {
        listString.addFirst(color);
        return "String añadida al principio de la lista";
    }
    
    public String insertar(String color, int index){
        listString.add(index,color);
        return "Elemento agregado0";
    }

    public String eliminarPrimero() {
        listString.removeFirst();
        return "String Primera eliminada";
    }

    public String eliminarUltimo() {
        listString.removeLast();
        return "String Ultima eliminada";
    }

    public String eliminarEnPosicion(int index) {
        listString.remove(index);
        return "String en indice: " +  index + "eliminada";
    }

    public String elminarPorNombre(String nombre) {
        String color;
        if((color = findByName(nombre))!=null) {
            listString.remove(color);
            return "color eliminada";
        }
        return "String no encontrada";
    }

    public String buscarPorNombre(String nombre) {
        String color;
        return (color = findByName(nombre)) != null ? color.toString() : "String no encontrada";
    }

    public String contenidoLista() {
        String res = "";
        for (String color : listString) {
            res+=color.toString()+"\n";
        }
        return res;
    }

    public String contenidoListaInverso() {
        String res = "";
        for(int i = listString.size()-1; i >= 0; i--) {
            res+=listString.get(i).toString()+"\n";
        }
        return res;
    }

    private String findByName(String nombre) {
        for (String color : listString) {
            if(color.equals(nombre))return color;
        }
        return null;
    }
}
