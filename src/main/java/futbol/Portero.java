package futbol;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;


    //Constructor
    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }


    //Metodos
    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal "
        + this.dorsal + ". Le han marcado " + this.golesRecibidos;
    }


    @Override
    public boolean jugarConLasManos() {
       return true;
    }

    public int compareTo(Futbolista o) {
        if (getGolesRecibidos() - ((Portero) o).getGolesRecibidos() > 0) {
            return getGolesRecibidos() - ((Portero) o).getGolesRecibidos();
        }else {
            return (getGolesRecibidos() - ((Portero) o).getGolesRecibidos()) * -1 ;
        }
    }


    //Getters y Setters
    public short getGolesRecibidos() {
        return golesRecibidos;
    }


    public void setGolesRecibidos(short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }


    public byte getDorsal() {
        return dorsal;
    }


    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }

}