import java.util.LinkedList;

class ListasEnlazadasPersona {
    LinkedList<Persona> listPersona;
    ListasEnlazadasPersona() {
        listPersona = new LinkedList<Persona>();
    }

    public String insertarAlFinal(Persona persona) {
        listPersona.addLast(persona);
        return "Persona añadida al final de la lista";
    }

    public String insertarAlPrincipio(Persona persona) {
        listPersona.addFirst(persona);
        return "Persona añadida al principio de la lista";
    }

    public String eliminarPrimero() {
        listPersona.removeFirst();
        return "Persona Primera eliminada";
    }

    public String eliminarUltimo() {
        listPersona.removeLast();
        return "Persona Ultima eliminada";
    }

    public String eliminarEnPosicion(int index) {
        listPersona.remove(index);
        return "Persona en indice: " +  index + "eliminada";
    }

    public String elminarPorNombre(String nombre) {
        Persona persona;
        if((persona = findByName(nombre))!=null) {
            listPersona.remove(persona);
            return "persona eliminada";
        }
        return "Persona no encontrada";
    }

    public String buscarPorNombre(String nombre) {
        Persona persona;
        return (persona = findByName(nombre)) != null ? persona.toString() : "Persona no encontrada";
    }

    public String contenidoLista() {
        String res = "";
        for (Persona persona : listPersona) {
            res+=persona.toString();
        }
        return res;
    }

    public String contenidoListaInverso() {
        String res = "";
        for(int i = listPersona.size()-1; i >= 0; i--) {
            res+=listPersona.get(i).toString();
        }
        return res;
    }

    private Persona findByName(String nombre) {
        for (Persona persona : listPersona) {
            if(persona.getNombre().equals(nombre))return persona;
        }
        return null;
    }
}
