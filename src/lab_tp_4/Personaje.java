package lab_tp_4;

public abstract class Personaje {

    protected Position ubicacion;

    protected String nick;

    protected int vidas;

    protected int energia;

    protected char orientacion;


    public Personaje(String nick, Position ubicacion) {
        this.nick=nick;
        this.ubicacion=ubicacion;
        this.vidas=3;
        this.energia=100;
        this.orientacion='N';

    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void disparar() {
        if (this.energia>=10){
            energia-=10;
        }else {
        }
    }

    public void avanzar() {
        switch (this.orientacion) {
            case 'N':
                this.ubicacion.setY(this.ubicacion.getY()+1);
                break;
            case 'E':
                this.ubicacion.setX(this.ubicacion.getX()+1);
                break;
            case 'S':
                this.ubicacion.setY(this.ubicacion.getY()-1);
                break;
            default:
                this.ubicacion.setX(this.ubicacion.getX()-1);
                break;
        }
    }

    public void girar() {
        switch (this.orientacion) {
            case 'N':
                this.orientacion='E';
                break;
            case 'E':
                this.orientacion='S';
                break;
            case 'S':
                this.orientacion='O';
                break;
            default:
                this.orientacion='N';
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
