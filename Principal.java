package principal;
import java.util.Random;
import java.util.Scanner;

public class Principal {

    static Scanner lector = new Scanner(System.in);
    static Mario mario;
    static Hongo hongo;
    static Random random = new Random();
    static int puntosDeVidaMario = 10;
    static int puntosDeVidaHongo = 1;
    static int velocidadMario = 1;
    static int velocidadHongo = 1;
    static int tiempoLimite = 60; // se mide en segundos
    static int tiempoActual = 0;
    static int puntosMario = 0; // Puntuación de Mario
    static boolean hongoHaAparecido = false;

    public static void main(String[] args) {
        char tecla; 

        mario = new Mario(0, velocidadMario, puntosDeVidaMario);

        do {
            System.out.println("Seleccione una opción");
            System.out.println("w. Mario salta ");
            System.out.println("d. Mario se mueve hacia adelante");
            System.out.println("a. Mario se mueve hacia atrás");
            System.out.println("z. Termina el juego");
            System.out.println("Tiempo restante: " + (tiempoLimite - tiempoActual) + " segundos");

            double numeroAleatorio = random.nextDouble();

            double probabilidad = 0.1; //posibilidad del 10
            if (numeroAleatorio < probabilidad && !hongoHaAparecido) {
                hongoHaAparecido = true;
                System.out.println("¡Un hongo ha aparecido!");

                hongo = new Hongo(random.nextInt(10), velocidadHongo);
            }

            if (hongoHaAparecido) {
                System.out.println("¡Un hongo ha aparecido!");
                System.out.println("Mario solo puede saltar para matarlo");
                tecla = lector.next().charAt(0);
                tecla = Character.toLowerCase(tecla);

               //eleccion de marioooo
                if (tecla == 'w') {
                    System.out.println("Mario ha saltado y matado al hongo");
                    puntosDeVidaMario += 10;
                    puntosMario += 10;
                    hongoHaAparecido = false;
                } else if (tecla == 'd') {
                    System.out.println("Mario ha elegido moverse adelante y ha muerto");
                    System.out.println("Mario ha muerto");
                    break;
                } else if (tecla == 'a') {
                    System.out.println("Mario se ha devuelto hacia atrás y el hongo lo sigue");
                    mario.moverAtras();
                    hongo.moverAtras();
                } else if (tecla == 'z') {
                    System.out.println("Saliendo del juego...");
                    System.exit(0); // Terminar el programa
                } else {
                    System.out.println("Tecla inválida");
                }
            } else {
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
                        System.out.println("Saliendo del juego...");
                        System.exit(0); // Terminar el programa
                        break;
                    default:
                        System.out.println("Tecla inválida");
                }
            }

            // Actualizar el tiempo
            tiempoActual++;
            if (tiempoActual >= tiempoLimite) {
                System.out.println("¡El tiempo ha expirado!");
                System.out.println(":-)"); // Cara de Mario feliz
                break;
            }

            // Mostrar el estado actual del juego
            System.out.println("Puntos de vida de Mario: " + puntosDeVidaMario);
            System.out.println("Puntos de vida del hongo: " + puntosDeVidaHongo);
            System.out.println("Puntuación de Mario: " + puntosMario);
        } while (true);
    }
}


