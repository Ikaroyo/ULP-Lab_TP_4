package lab_tp_4;


import java.util.Scanner;

public class TestHerencia {

    public static void main(String[] args) {

        Guerrero warrior = new Guerrero("Thor", 100, 200);

        int energyStart;
        int energyEnd;

        Scanner teclado = new Scanner(System.in);

        energyStart = warrior.getEnergia();

        // Impresion de los valores al inicio si se quisiera
        System.out.println("***************************************************");
        System.out.println("Su estado inicial es:");
        System.out.println("Su orientacion es: " + warrior.getOrientacion());
        System.out.println("Su posicion es: (x,y)=(" + warrior.getUbicacion().getX() + "," + warrior.getUbicacion().getY() + ")");
        System.out.println("Su energia actual es: " + warrior.getEnergia());
        System.out.println("***************************************************");


        // Encontrar un caballo
        if (!warrior.getCaballo()) {
            System.out.println("Thor ha encontrado un caballo, desea montarlo? (s/n)");
           String answer = teclado.nextLine();
            if (answer.equals("s")) {
                warrior.setCaballo(true);
            } else {
                System.out.println("Thor no desea montar el caballo");
            }
        }

        // Inicio en N girar 3 hasta mirar al O
        while (warrior.getOrientacion() != 'O') {
            warrior.girar();
        }

        // Avanzar 5 veces
        for (int i = 0; i < 5; i++) {
            warrior.avanzar();
        }

        // Disparar 8 veces
        for (int i = 0; i < 8; i++) {
            warrior.disparar();
        }


        energyEnd = warrior.getEnergia();

        // Impresion del estado final si se quiere
        System.out.println("***************************************************");
        System.out.println("Su estado final es:");
        System.out.println("Su orientacion es: " + warrior.getOrientacion());
        System.out.println("Su posicion es: (x,y)=(" + warrior.getUbicacion().getX() + "," + warrior.getUbicacion().getY() + ")");
        System.out.println("Su energia actual es: " + warrior.getEnergia());
        System.out.println("***************************************************");

        System.out.println("Respuesta 1 del TP 4:");
        // ¿Cual es el estado de energía al inicializar la ejecución y cual después de ejecutarse el ítem d?
        System.out.println("***************************************************");
        System.out.println("Su energia al inicio era: " + energyStart + " y su energia actual es: " + energyEnd);
        System.out.println("***************************************************");

        System.out.println("Respuesta 2 del TP 4:");
        // ¿Cual es la nueva posición del Guerrero al finalizar la ejecución?
        System.out.println("Su posicion es: (x,y)=(" + warrior.getUbicacion().getX() + "," + warrior.getUbicacion().getY() + ")");
        System.out.println("***************************************************");
    }
}
