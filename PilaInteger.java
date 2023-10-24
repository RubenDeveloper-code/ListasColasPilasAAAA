import java.util.Stack;

class PilaInteger {
    private Stack<Integer> pilaInteger;

    PilaInteger() {
        pilaInteger = new Stack<Integer>();
    }

    public String push(Integer integer) {
        pilaInteger.push(integer);
        return "Integer agregado";
    }

    public Integer pop() {
        return pilaInteger.pop();
    }

    //ImprimirPila
    public String contenidoPila() {
        String res = "";
        for (Integer integer : pilaInteger) {
            res+=integer.toString()+"\n";
        }
        return res;
    }

    //ImprimirPilaInversa
    public String contenidoPilaInverso() {
        String res = "";
        for(int i = pilaInteger.size()-1; i >= 0; i--) {
            res+=pilaInteger.get(i).toString()+"\n";
        }
        return res;
    }
}
