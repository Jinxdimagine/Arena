package Tridy;

public class Mag extends Postava {
    public Mag(String jmeno) {
        super(jmeno);
        setIntelegenci(getIntelegenci()+3);
        setTrida(Trida.MAG);
    }
}
