package model;


public abstract class Persona {
    private String nombre;
    private String edad;
    private String telefono;
    

    public Persona(String nombre, String edad, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }
    
    
    
    
}
