package lab_tp_4;

public class Guerrero extends Personaje {

    protected boolean caballo;


    public Guerrero(String nick, Position ubicacion) {
        super(nick,ubicacion);

    }
    
    public boolean getCaballo(){
        return this.caballo;
    }
    
    public void setCaballo(boolean tieneCaballo){
        this.caballo=tieneCaballo;
    }

    @Override
    public void avanzar() {
                switch (this.orientacion) {
            case 'N':
                this.ubicacion.setY(this.ubicacion.getY()+10);
                break;
            case 'E':
                this.ubicacion.setX(this.ubicacion.getX()+10);
                break;
            case 'S':
                this.ubicacion.setY(this.ubicacion.getY()-10);
                break;
            default:
                this.ubicacion.setX(this.ubicacion.getX()-10);
                break;
        }
    }

    @Override
    public void disparar() {
        if (this.energia>=30){
            energia-=10;
        }else if(this.getCaballo() && this.energia<30 && this.energia>=10){
            energia-=10;
            this.setCaballo(false);
        } else if (!this.getCaballo() && this.energia>=10){
            energia-=10;
        }else {
        }
    }
}
