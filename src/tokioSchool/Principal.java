package tokioSchool;

import tokioSchool.util.Camion;
import tokioSchool.util.Coche;
import tokioSchool.util.DemasiadoRapidoException;
import tokioSchool.util.Remolque;

public class Principal {
    public static void main(String [] args) throws DemasiadoRapidoException {

        Coche coche1 = new Coche("lxl0398", 140,5);
        Camion camion1 = new Camion("ddss5544",50,null);

        coche1.acelerar(20);
        System.out.println(coche1);
        System.out.println(coche1.getPuertas());

        System.out.println("----------------------------------------");


        System.out.println(camion1.ponRemolque(new Remolque(60)));
        System.out.println(camion1.quitaRemolque(new Remolque(60)));
        System.out.println(camion1.acelerar(20));
    }
}
