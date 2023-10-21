import java.util.PriorityQueue;

class ColasCliente {
    private PriorityQueue<Cliente> colaCilente;
    ColasCliente() {
        colaCilente = new PriorityQueue<Cliente>();
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
            res+=cliente.toString();
        }
        return res;
    }

    public String contenidoColaInverso() {
        return contenidoRescursivoPaVoltearLosResultadosAdemasAprovechoParaDemostrarMiTotalApoyoAlPresidenteComandanteSupremoDeLasFuerzasArmadasAndresManuelLopezObradorLealtadAbsolutaALaCuantroT(colaCilente.size());
    }

    private String contenidoRescursivoPaVoltearLosResultadosAdemasAprovechoParaDemostrarMiTotalApoyoAlPresidenteComandanteSupremoDeLasFuerzasArmadasAndresManuelLopezObradorLealtadAbsolutaALaCuantroT(int i) {
        if(i>0)
            contenidoRescursivoPaVoltearLosResultadosAdemasAprovechoParaDemostrarMiTotalApoyoAlPresidenteComandanteSupremoDeLasFuerzasArmadasAndresManuelLopezObradorLealtadAbsolutaALaCuantroT(i);
        return colaCilente.peek().toString();
    }

}
