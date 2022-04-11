package lab_tp_4;

public abstract class Personaje {

    protected Position ubicacion;

    protected String nick;

    protected int vidas;

    protected int energia;

    protected char orientacion;

    public Personaje(String nick, int x, int y) {
        ubicacion = new Position(100, 200);
        this.nick = nick;
        this.vidas = 3;
        this.energia = 100;
        this.orientacion = 'N';

    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void disparar() {
        if (this.energia >= 10) {
            energia -= 10;
        }
    }

    public void avanzar() {

        switch (this.orientacion) {
            case 'N':
                this.ubicacion.setY(this.ubicacion.getY() + 1);
                break;
            case 'E':
                this.ubicacion.setX(this.ubicacion.getX() + 1);
                break;
            case 'S':
                this.ubicacion.setY(this.ubicacion.getY() - 1);
                break;
            default:
                this.ubicacion.setX(this.ubicacion.getX() - 1);
        }
        /*
        switch (this.orientacion) {
            case 'N' : this.ubicacion.setY(this.ubicacion.getY() + 1);
            case 'E' : this.ubicacion.setX(this.ubicacion.getX() + 1);
            case 'S' : this.ubicacion.setY(this.ubicacion.getY() - 1);
            default : this.ubicacion.setX(this.ubicacion.getX() - 1);
        }
         */
    }

    public void girar() {
        switch (this.orientacion) {
            case 'N':
                this.orientacion = 'E';
                break;
            case 'E':
                this.orientacion = 'S';
                break;
            case 'S':
                this.orientacion = 'O';
                break;
            default:
                this.orientacion = 'N';
                break;
        }

    }

    public Position getUbicacion() {
        return ubicacion;
    }

    public char getOrientacion() {
        return orientacion;
    }
}
