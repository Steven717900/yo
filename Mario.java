package principal; 
 
public class Mario {
    private int posicion;
    private int velocidad;
    private int puntosDeVida;

    public Mario(int posicion, int velocidad, int puntosDeVida) {
        this.posicion = posicion;
        this.velocidad = velocidad;
        this.puntosDeVida = puntosDeVida;
    }

    public void Salto() {
        System.out.println("Mario ha saltado");
    }

    public void moverAdelante() {
        posicion += velocidad;
    }

    public void moverAtras() {
        posicion -= velocidad;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }
}

}
