package Rasy;

public class Clovek implements TypRasy {


    @Override
    public double bonusSila(double sila) {
        return sila*0.03;
    }

    @Override
    public double bonusInteligence(double inteligence) {
        return inteligence*0.03;
    }

    @Override
    public double bonusObratnost(double obratnost) {
        return obratnost*0.04;
    }

    @Override
    public double bonusOdolnost(double odolnost) {
        return 0;
    }

}
