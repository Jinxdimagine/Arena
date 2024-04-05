public class Valecnik extends Postava {

    public Valecnik(String jmeno) {
        super(jmeno);
       setSila(getSila()+3);
       setTrida(Trida.VALECNIK);
    }
}
