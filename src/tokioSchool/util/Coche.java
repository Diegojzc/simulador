package tokioSchool.util;

public class Coche extends Vehiculo {

    private int puertas;

    public Coche(String matricula, int velocidad, int puertas ) {
        super(matricula, velocidad);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                " Vehiculo{" +
                " matricula='" + this.getMatricula() + '\'' +
                ", velocidad=" + this.getVelocidad() +'\'' +
                " puertas=" + puertas +
                '}';
    }


    @Override
    public int acelerar(int velocidad) {
       super.velocidad += velocidad;

        return velocidad;
    }
}
