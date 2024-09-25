package principal;

import java.util.Scanner;

public class Principal {

    static Scanner lector = new Scanner(System.in);
    static Mario mario ; 
    static Hongo hongo ; 

    public static void main(String[] args) {
        char tecla; // Declare tecla variable

        do {
            System.out.println("Seleecciona una opción");
            System.out.println("w. Mario salta ");
            System.out.println("d. Mario se mueve hacia adelante");
            System.out.println("a. Mario se mueve hacia atras");
            System.out.println("z. Termina el juego");

            tecla = lector.next().charAt(0);
            tecla = Character.toLowerCase(tecla);

            switch (tecla) {

                case 'w':
                    mario.Salto();
                    break;
                case 'd':
                    mario.moverAdelante();
                    break;
                case 'a':
                    mario.moverAtras();
                    break;
                case 'z':
                    System.out.println("saliendo del juego");
                    break;
                default:
                    System.out.println("Tecla inválida");
            }

            if (subZero.getVida() <= 0 || scorpio.getVida() <= 0) {
                String nombreGanador = (subZero.getVida() <= 0) ? scorpio.getNombre() : subZero.getNombre();
                System.out.println("El juego terminó, y el ganador es " + nombreGanador);
                tecla = 'z';
            }
        } while (tecla != 'z');
    }
}





