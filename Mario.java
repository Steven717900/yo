/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
class Mario {
    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;
    private int velocidad;
public Mario (String nombre, int vida,int ataque, int defensa,int velocidad) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa= defensa;
        this.velocidad = velocidad;
    }
     
     public void moverAdelante(){
System.out.println(nombre + " se ha movido adelante.");

}
       public void moverAtras() {
        System.out.println(nombre + " se ha movido Atras.");

    }
     public void tocarHongo() {
        vida = 0; 
        System.out.println(nombre + " ha tocado un hongo y ha muerto.");
    }
    public void vida(){
        
    }
    
    public void lanzarObjeto(){
        
    }
    
}
