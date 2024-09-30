
package principal;
public class Mario {

    private int posicion;
    private int velocidad;
    private int puntosDeVida;
    private int puntos;
    private String nombre;

    public Mario(String nombre,int posicion, int velocidad, int puntosDeVida, int puntos) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.velocidad = velocidad ;
        this.puntosDeVida = puntosDeVida;
        this.puntos = puntos;
    }

    public void Salto(int salto) {
       this.posicion += salto;
    }

    public void moverAdelante(int pasos) {
        this.posicion += pasos;
    }

    public void moverAtras(int pasos) {
        this.posicion -= pasos;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
