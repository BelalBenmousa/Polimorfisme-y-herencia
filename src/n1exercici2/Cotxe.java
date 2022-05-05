package n1exercici2;

public class Cotxe {
    //El valor sempre será el mateix, no pot cambiar i es pot accedir sense instanciar l'objecte
    static final String marca = "Mercedes";


    //no s'han d'instanciar es pot accedir directament
    static String model;
    static Cotxe car;


    //no es pot cambiar el valor una vegada creat en el con, sermpre serà el mateix i es inicilitzar en el constructor
    final int potencia ;
    static {
        car = new Cotxe("V5", 50);
    }

    public Cotxe(String model, int potencia) {
        this.model = model;
        this.potencia = 50;
    }
    // s'ha d'instanciar l'objecte pero poder accedir a aquest mètode
    public void acelerar(){
        System.out.println("El vehicle està accelerant");
    }
    //al ser static ja es carrega en memoria al pricipi y es pot accedir sense instanciar l'objecte, al main hi ha una demostració
    public static void frenar (){
        System.out.println("El vehicle està frenant");
    }

}
