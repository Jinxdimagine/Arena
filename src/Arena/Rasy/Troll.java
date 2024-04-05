package Arena.Rasy;

public class Troll implements TypRasy {
    @Override
    public double bonusSila(double sila) {
        return sila*0.1;
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
        return 0;
    }
}
