package n1exercici1;

public class InstrumentVent extends Instrument{
    public InstrumentVent(String nom, int preu) {
        super(nom, preu);
    }
    static InstrumentVent instrumentVent;
    static {
        instrumentVent = new InstrumentVent("Flauta", 25);
    }

    @Override
    public String getNom() {
        return super.getNom();
    }

    @Override
    public int getPreu() {
        return super.getPreu();
    }

    @Override
    public void Tocar() {
        super.Tocar();
        System.out.println("s’està tocant un instrument de vent");
    }

    @Override
    public String toString() {
        return "InstrumentVent{} " + super.toString();
    }
}
