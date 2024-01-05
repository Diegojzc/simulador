package tokioSchool.util;

public abstract class Vehiculo {

    private String matricula;
    protected int velocidad;

    public Vehiculo(String matricula, int velocidad) {
        this.matricula = matricula;
        this.velocidad = velocidad;

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }



    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", velocidad= " + velocidad +
                '}';
    }


    public int acelerar(int velocidad) throws DemasiadoRapidoException{
        velocidad +=velocidad;
        return velocidad;
    };
}
