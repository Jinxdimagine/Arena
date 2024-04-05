public class Postava {
    private String jmeno;
    private double level;
    private double sila;
    private double intelegenci;
    private double obratnost;
    private double odolnost;
    private double points;
    private double zivoty;
    private double zkusenosti;
    private Trida trida;
    private TypRasy typRasy;
    public Postava(String jmeno) {
        setJmeno(jmeno);
        setLevel(1);
        setSila(1);
        setIntelegenci(1);
        setObratnost(1);
        setOdolnost(1);
        setPoints(5);
        setZivoty(getLevel());
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public double getSila() {
        return sila;
    }

    public void setSila(double sila) {
        if (typRasy!=null){
            this.sila = sila+typRasy.bonusSila(sila);
        }else {
            this.sila = sila;
        }

    }

    public double getIntelegenci() {
        return intelegenci;
    }

    public void setIntelegenci(double intelegenci) {
        if (typRasy!=null){
            this.intelegenci = intelegenci+typRasy.bonusInteligence(intelegenci);
        }else {
            this.intelegenci = intelegenci;
        }

    }

    public double getObratnost() {
        return obratnost;
    }

    public void setObratnost(double obratnost) {
        if (typRasy!=null){
            this.obratnost = obratnost+typRasy.bonusObratnost(obratnost);
        }else{
            this.obratnost = obratnost;
        }

    }

    public double getOdolnost() {
        return odolnost;
    }

    public void setOdolnost(double odolnost) {
        if (typRasy!=null){
            this.odolnost = odolnost+typRasy.bonusOdolnost(odolnost);
        }else {
            this.odolnost = odolnost;
        }

    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public double getZivoty() {
        return zivoty;
    }

    public void setZivoty(double level) {
        this.zivoty = level*100;
    }

    public double getZkusenosti() {
        return zkusenosti;
    }

    public void setZkusenosti(double zkusenosti) {
        this.zkusenosti = zkusenosti;
    }

    public Trida getTrida() {
        return trida;
    }

    public void setTrida(Trida trida) {
        this.trida = trida;
    }

    public TypRasy getTypRasy() {
        return typRasy;
    }

    public void setTypRasy(TypRasy typRasy) {
        this.typRasy = typRasy;
    }

    @Override
    public String toString() {
        return "Postava{" +
                "jmeno='" + jmeno + '\'' +
                ", level=" + level +
                ", sila=" + sila +
                ", intelegenci=" + intelegenci +
                ", obratnost=" + obratnost +
                ", odolnost=" + odolnost +
                ", points=" + points +
                ", zivoty=" + zivoty +
                ", zkusenosti=" + zkusenosti +
                ", trida=" + trida +
                '}';
    }
}
