package n1exercici1;

public class InstrumentPercusio extends Instrument {


    public InstrumentPercusio(String nom, int preu) {
        super(nom, preu);
    }

    static InstrumentPercusio instrumentPercusio;
    static {
        instrumentPercusio = new InstrumentPercusio("xilófon", 15);
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
        System.out.println("s’està tocant un instrument de percussió");
    }
    @Override
    public String toString() {
        return "InstrumentVent{} " + super.toString();
    }
}
