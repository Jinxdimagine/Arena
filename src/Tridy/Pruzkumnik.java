package Tridy;

public class Pruzkumnik extends Postava {
    public Pruzkumnik(String jmeno) {
        super(jmeno);
        setObratnost(getObratnost()+3);
        setTrida(Trida.PRUZKUMNIK);
    }
}
