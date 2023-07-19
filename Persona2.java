public class Persona2 {
    private int edad;
    private String nombre;
    private String telefono;


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Getter y Setter para la propiedad nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para la propiedad telefono
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static void main(String[] args) {
        // Crear un objeto Persona
        Persona2 persona = new Persona2();

        // Establecer los valores utilizando los métodos setter
        persona.setEdad(25);
        persona.setNombre("Pepe");
        persona.setTelefono("000000000");

        // Obtener los valores utilizando los métodos getter y mostrarlos por consola
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Teléfono: " + persona.getTelefono());
    }
}
