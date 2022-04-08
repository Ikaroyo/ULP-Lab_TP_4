package lab_tp_4;

public class TestHerencia {

    public static void main(String[] args) {
        Position pos = new Position(100, 200);
        Guerrero warrior = new Guerrero("Thor", pos);

        int energyStart;
        int energyEnd;

        energyStart = warrior.getEnergia();

        // Impresion de los valores al inicio si se quisiera        
        System.out.println("***************************************************");
        System.out.println("Su estado inicial es:");
        System.out.println("Su orientacion es: " + warrior.getOrientacion());
        System.out.println("Su posicion es: (x,y)=(" + pos.getX() + "," + pos.getY()+")");
        System.out.println("Su energia actual es: " + warrior.getEnergia());
        System.out.println("***************************************************");

        // Inicio en N girar 3 hasta mirar al O 
        warrior.girar();
        warrior.girar();
        warrior.girar();

        // Avanzar 5 veces
        warrior.avanzar();
        warrior.avanzar();
        warrior.avanzar();
        warrior.avanzar();
        warrior.avanzar();

        // Disparar 8 veces
        warrior.disparar();
        warrior.disparar();
        warrior.disparar();
        warrior.disparar();
        warrior.disparar();
        warrior.disparar();
        warrior.disparar();
        warrior.disparar();

        energyEnd = warrior.getEnergia();

        // Impresion del estado final si se quiere
        System.out.println("***************************************************");
        System.out.println("Su estado final es:");
        System.out.println("Su orientacion es: " + warrior.getOrientacion());
        System.out.println("Su posicion es: (x,y)=(" + pos.getX() + "," + pos.getY()+")");
        System.out.println("Su energia actual es: " + warrior.getEnergia());
        System.out.println("***************************************************");

        System.out.println("Respuesta 1 del TP 4:");
        // ¿Cual es el estado de energía al inicializar la ejecución y cual después de ejecutarse el ítem d?
        System.out.println("***************************************************");
        System.out.println("Su energia al inicio era: " + energyStart + " y su energia actual es: " + energyEnd);
        System.out.println("***************************************************");

        System.out.println("Respuesta 2 del TP 4:");
        // ¿Cual es la nueva posición del Guerrero al finalizar la ejecución?
        System.out.println("Su posicion es: (x,y)=(" + pos.getX() + "," + pos.getY()+")");
        System.out.println("***************************************************");
    }
}
