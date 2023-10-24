class Cliente implements Comparable<Cliente> {
    private int cuenta;
    private String nombre;
    private String apellidoPaterno;
    private double saldo;

    Cliente(int cuenta, String nombre, String apellidoPaterno, double saldo) {
        this.cuenta = cuenta;
        this. nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.saldo = saldo;
    }
    @Override
    public int compareTo(Cliente cliente) { //Pinche vida miada
        return 666;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + " cuenta " + cuenta + " apellidoP: " + apellidoPaterno + " saldo: " + saldo;
    }
}
