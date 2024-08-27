package futbol;

public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;

    //Constructor
    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador() {
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }


    //Metodos
    public int compareTo(Futbolista f) {
        if (getEdad() - f.getEdad() > 0) {
            return getEdad() - f.getEdad();
        }else {
            return (getEdad() - f.getEdad()) * -1 ;
        }
    }

    @Override
    public boolean jugarConLasManos() {
        return false;
    }

    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal "
        + this.dorsal + ". Ha marcado " + this.golesMarcados;
    }

    //Getters y Setters
    public short getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(short golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }

    

}
