package Arena.Rasy;

public class Nemrtvi implements TypRasy {
    @Override
    public double bonusSila(double sila) {
        return 0;
    }

    @Override
    public double bonusInteligence(double inteligence) {
        return inteligence*0.1;
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
