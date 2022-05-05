package n2exercici1;

public class Telefon implements Camera, Rellotge {
    private String marca;
    private String model;

    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public void Trucar(String numTelefon){
        System.out.println("S'està trucant al numero "+numTelefon);
    }

    @Override
    public void fotografiar() {
        System.out.println("S'està fent una foto");
    }

    @Override
    public void alarmar() {
        System.out.println("Està sonant l'alarma");
    }
}
