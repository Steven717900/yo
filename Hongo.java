
package principal;

public class Hongo {

    private int posicion;
    private int vida;
    private int velocidad;

    public Hongo(int posicion, int velocidad, int vida) {
        if (posicion < 0 || velocidad < 0 || vida < 0) {
            throw new IllegalArgumentException("Position, velocity and life must be non-negative");
        }
        this.posicion = posicion;
        this.velocidad = velocidad;
        this.vida = vida;
    }

    public void moverAdelante() {
        this.posicion += this.velocidad;
    }

    public void moverAtras() {
        this.posicion -= this.velocidad;
    }

    public int getPosicion() {
        return this.posicion;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Hongo [posicion=" + posicion + ", vida=" + vida + ", velocidad=" + velocidad + "]";
    }
}
