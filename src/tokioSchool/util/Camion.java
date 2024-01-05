package tokioSchool.util;

public class Camion extends Vehiculo {

    private Remolque remolque;



    public Camion(String matricula, int velocidad, Remolque remolque) {
        super(matricula, velocidad);
        this.remolque = null;
    }

    public Remolque getRemolque() {
        return remolque;
    }

    public void setRemolque(Remolque remolque) {
        this.remolque = remolque;
    }
    public Remolque ponRemolque(Remolque remolque){
        this.remolque = remolque;
        return remolque;
    }
    public Remolque quitaRemolque(Remolque remolque){
        return  this.remolque = null;

    }

    @Override
    public String toString() {
        if(remolque!= null){
        return super.toString()+ " lleva un remolque " + remolque.toString();
        }else{
            return super.toString();
        }
    }

    @Override
    public int acelerar(int velocidad) throws DemasiadoRapidoException {
        if (getVelocidad() + velocidad >100 && remolque!= null){
            throw new DemasiadoRapidoException();
        }
        ;
        return super.acelerar(velocidad);
    }
}
