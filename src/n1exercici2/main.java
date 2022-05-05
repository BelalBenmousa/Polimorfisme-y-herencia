/*Exercici 2.
*/
package n1exercici2;

public class main {
    public static void main(String[] args) {
        //es pot cridar sense instanciar l'objecte, mai canviarà de valor al ser final, sempre serà el definit prèviament
        System.out.println(Cotxe.marca);
        //al ser static podem accedir al metode sense necesitat de instanciar el nou objecte
        Cotxe.frenar();
        Cotxe cotxe = new Cotxe("4 cilindres", 300);
        System.out.println(cotxe.model);
        //per poder accedir al métode acelerar al no ser static haurem d'instanciar un nou objecte per poder utilitzar-lo
        cotxe.acelerar();
        System.out.println(cotxe.potencia);
    }
}
