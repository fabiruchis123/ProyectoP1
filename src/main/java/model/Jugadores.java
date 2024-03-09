
package model;


public class Jugadores extends Persona {
    
    @SuppressWarnings("FieldMayBeFinal")
    private int apuesta;
    
    public Jugadores(String nombre, String edad, String telefono, int apuesta) {
        super(nombre, edad, telefono);
        this.apuesta=apuesta;
    }

    public int getApuesta() {
        return apuesta;
    }
    
}
