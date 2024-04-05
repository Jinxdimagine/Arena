package Arena.Rasy;

public class Trpaslik implements TypRasy {
    @Override
    public double bonusSila(double sila) {
        return sila*0.7;
    }

    @Override
    public double bonusInteligence(double inteligence) {
        return 0;
    }

    @Override
    public double bonusObratnost(double obratnost) {
        return 0;
    }

    @Override
    public double bonusOdolnost(double odolnost) {
        return odolnost*0.3;
    }
}
