import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

class ColasCliente {
    private PriorityQueue<Cliente> colaCilente;
    ColasCliente() {
        colaCilente = new PriorityQueue<>();
    }

    public String insertar(Cliente cliente) {
        colaCilente.add(cliente);
        return "Cliente agregado a cola";
    }

    public String eliminar() {
        colaCilente.remove(colaCilente.peek());
        return "Elemento eliminado asi bien eliminadote";
    }

    public String contenidoCola() {
        String res = "";
        for (Cliente cliente : colaCilente) {
            res+=cliente.toString()+"\n";
        }
        return res;
    }

    public String contenidoColaInverso() {
        return contenidoRescursivoPaVoltearLosResultadosAdemasAprovechoParaDemostrarMiTotalApoyoAlPresidenteComandanteSupremoDeLasFuerzasArmadasAndresManuelLopezObradorLealtadAbsolutaALaCuantroT(colaCilente.size());
    }

    private String contenidoRescursivoPaVoltearLosResultadosAdemasAprovechoParaDemostrarMiTotalApoyoAlPresidenteComandanteSupremoDeLasFuerzasArmadasAndresManuelLopezObradorLealtadAbsolutaALaCuantroT(int i) {
        List<Cliente> values = colaCilente.stream().sorted().collect(Collectors.toList());
        Collections.reverse(values);
        String res = "";
        for (Cliente cliente : values) {
            res+=cliente.toString()+"\n";
        }
        return res;
    }

}
