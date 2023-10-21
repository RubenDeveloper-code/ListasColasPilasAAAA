class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private char genero;
    private String direccion;
    private short correo;
    private String fechaNacimiento;

    Persona(String nombre, String apellido, int edad, char genero, String direccion, short correo, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " Edad: " + edad + " Genero: " + genero + " direccion: " + direccion + " Correo: " + correo + " fecha Nacimiento: " + fechaNacimiento;
    }
}
