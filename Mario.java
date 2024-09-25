/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

class Mario {

    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;
    private int velocidad;
    private int posicion;

    public Mario(String nombre, int vida, int ataque, int defensa, int velocidad) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
    }

    public void moverAdelante() {
        System.out.println(nombre + " Mario se ha movido adelante.");
        posicion++;
    }

    public void moverAtras() {
        System.out.println(nombre + "Mario se ha movido Atras.");
        posicion--;
    }

    public void Salto() {

        System.out.println(nombre + " Mario ha saltado");
    }

    public void tocoHongo() {
        vida = 0;
    }

    public int getVida() {
        return vida;
    }

    public int getPosicion() {
        return posicion;
    }

    public void vida() {

    }

   

}
