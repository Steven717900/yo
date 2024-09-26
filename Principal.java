package principal;

import java.util.Random;
import java.util.Scanner;

public class Principal {

    static Scanner lector = new Scanner(System.in);
    static Mario mario;
    static Hongo hongo;
    
    static Random random = new Random();
    static int tiempoLimite = 30;
    static int tiempoActual = 0;
    static boolean hongoHaAparecido = false;

    public static void main(String[] args) {
        char tecla;

        mario = new Mario(0, 1, 10, 0); 
        do {
            System.out.println("Seleccione una opcion");
            System.out.println("w. Mario salta ");
            System.out.println("d. Mario se mueve hacia adelante");
            System.out.println("a. Mario se mueve hacia atras");
            System.out.println("z. Termina el juego");
            System.out.println("Tiempo restante: " + (tiempoLimite - tiempoActual) + " segundos");

            double numeroAleatorio = random.nextDouble();

            double probabilidad = 0.1; //posibilidad del 10
            if (numeroAleatorio < probabilidad && !hongoHaAparecido) {
                hongoHaAparecido = true;
                System.out.println("Un hongo ha aparecido");

                hongo = new Hongo(random.nextInt(10), 1, 1);
            }

            if (hongoHaAparecido) {
                System.out.println("Un hongo ha aparecido");
                System.out.println("Mario solo puede saltar para matarlo");
                tecla = lector.next().charAt(0);
                tecla = Character.toLowerCase(tecla);

                //eleccion de marioooo  :)
                if (tecla == 'w') {
                    System.out.println("Mario ha saltado y matado al hongo");
                    mario.setPuntosDeVida(mario.getPuntosDeVida() + 10);
                    mario.setPuntos(mario.getPuntos() + 10);
                    hongoHaAparecido = false;
                } else if (tecla == 'd') {
                    System.out.println("Mario ha elegido moverse 5 pasos adelante y ha muerto");
                    System.out.println("Mario ha muerto");
                    break;
                } else if (tecla == 'a') {
                    System.out.println("Mario se ha devuelto 5 pasos hacia atras y el hongo lo sigue");
                    mario.moverAtras(5);
                    hongo.moverAtras();
                } else if (tecla == 'z') {
                    System.out.println("Saliendo del juego...");
                    System.exit(0);
                } else {
                    System.out.println("Tecla inválida");
                }
            } else {
                tecla = lector.next().charAt(0);
                tecla = Character.toLowerCase(tecla);

                switch (tecla) {
                    case 'w':
                        mario.Salto(2);
                        System.out.println("Mario se ha elevado 2 bloques");
                        break;
                    case 'd':
                        mario.moverAdelante(5);
                        System.out.println("Mario se movio 5 pasos adelante");
                        break;
                    case 'a':
                        mario.moverAtras(5);
                        System.out.println("Mario se movio 5 pasos atras");
                        break;
                    case 'z':
                        System.out.println("Saliendo del juego...");
                        System.exit(0);
                    default:
                        System.out.println("Tecla inválida");
                }
            }

            tiempoActual++;
            if (tiempoActual > tiempoLimite) {
                System.out.println("Tiempo agotado. Fin del juego.");
                break;
            }
        } while (true);
    }
}
