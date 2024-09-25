package principal;

class Hongo {

    private int posicion;

    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;
    private int velocidad;

    public Hongo(String nombre, int vida, int ataque, int defensa, int velocidad) {
        this.nombre = nombre;
        this.vida = vida;
        this.velocidad = velocidad;
    }

    public void moverAdelante() {
        System.out.println(nombre + " Hongo se ha movido adelante.");
        posicion++;
    }

    public void moverAtras() {
        System.out.println(nombre + "Hongo se ha movido Atras.");
        posicion--;
    }

    public void tocaMario(Mario mario) {
        mario.tocoHongo();
    }

    public int getPosicion() {
        return posicion;

    }
}
