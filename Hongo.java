package principal;

public class Hongo {

    private int posicion;
    private int velocidad;

    public Hongo(int posicion, int velocidad) {
        this.posicion = posicion;
        this.velocidad = velocidad;
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
}
