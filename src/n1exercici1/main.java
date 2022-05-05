package n1exercici1;

/*Exercici 1.
En un grup de música hi ha diferents tipus d’instruments musicals. Hi ha instruments de vent, de corda i de percussió.

Tots els instruments tenen com a atributs el seu nom, i el seu preu. A més, tenen un mètode anomenat tocar(). Aquest, és abstracte a la classe instrument i, per tant, s’ha d’implementar a les classes filles. Si s’està tocant un instrument de vent, el mètode ha de mostrar per consola: ”Està sonant un instrument de vent”, si s’està tocant un instrument de corda: “Està sonant un instrument de corda” i si s’està tocant un instrument de percussió: “Està sonant un instrument de percussió”.

El procés de càrrega d'una classe només té lloc una vegada. Demostra que la càrrega pot ser provocada per la creació de la primera instància d'aquesta classe o per l'accés a un membre estàtic d'aquesta.

Cerca informació sobre els blocs d'inicialització i blocs estàtics en Java.*/
public class main {
    public static void main(String[] args) {

        System.out.println("Clases static :");
        System.out.println(InstrumentVent.instrumentVent.toString());
        System.out.println(InstrumentCorda.instrumentCorda.toString());
        System.out.println(InstrumentPercusio.instrumentPercusio.toString());


        System.out.println("***************");
        System.out.println("Instanciant objectes");
        InstrumentCorda violi = new InstrumentCorda("Violí", 50);
        violi.Tocar();
        System.out.println(violi.toString());
        InstrumentPercusio tambor = new InstrumentPercusio("Tambor", 55);
        tambor.Tocar();
        System.out.println(tambor.toString());
        InstrumentVent saxo = new InstrumentVent("Saxo", 20);
        saxo.Tocar();
        System.out.println(saxo.toString());
    }
}
