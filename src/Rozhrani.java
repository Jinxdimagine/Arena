import Tridy.Mag;
import Tridy.Pruzkumnik;

public class Rozhrani {

    void levelup(Postava postava) {

    }

    public String start() {
        return "Vitej hraci v Arene v tuhle chvili jsi vyber sve jmeno";
    }

    public String Trida() {
        return "Nyni jsi muzete vybrat Tridu:" + "\n" +
                "1)Valecnik (Prida +3 sila)" + "\n" +
                "2)Tridy.Mag (Prida +3 inteligence)" + "\n" +
                "3)Tridy.Pruzkumnik (Prida +3 obratnost)";
    }
    public String Rasa(){
        return "Nyni jsi vyberte Rasu"+ "\n" +
                "1)clovek (+3% síla, +3% inteligence, +4% obratnost )"+ "\n" +
                "2)elf (+6% inteligence, +4% obratnost)"+ "\n" +
                "3)trpaslík (+7% síla, +3% odolnost)"+ "\n" +
                "4)troll (+10% síla)"+ "\n" +
                "5)temný elf (+4% inteligence, +6% obratnost)"+ "\n" +
                "6)nemrtví (+10% inteligence)";
    }

    public Postava vyberTridy(String jmeno, int vyber) {
        switch (vyber) {
            case 1:
                return new Valecnik(jmeno);
            case 2:
                return new Mag(jmeno);
            case 3:
                return new Pruzkumnik(jmeno);
            default:
                return null;
        }
    }
}
