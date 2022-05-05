package n1exercici1;

public class InstrumentCorda extends Instrument{
    public InstrumentCorda(String nom, int preu) {
        super(nom, preu);
    }

    static InstrumentCorda instrumentCorda;
    static {
        instrumentCorda = new InstrumentCorda("Guitarra", 58);
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
        System.out.println("s’està tocant un instrument de corda");
    }
    @Override
    public String toString() {
        return "InstrumentVent{} " + super.toString();
    }
}
