package Arena.Rasy;

public class ElfT implements TypRasy {

    @Override
    public double bonusSila(double sila) {
        return 0;
    }

    @Override
    public double bonusInteligence(double inteligence) {
        return inteligence*0.4;
    }

    @Override
    public double bonusObratnost(double obratnost) {
        return obratnost*0.6;
    }

    @Override
    public double bonusOdolnost(double odolnost) {
        return 0;
    }
}
